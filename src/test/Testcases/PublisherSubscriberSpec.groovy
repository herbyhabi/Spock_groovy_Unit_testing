import spock.lang.Specification

class Publisher {
    def subscribers = []

    def send(event) {
        for (it in subscribers) {
            it.receive(event)

        }
    }
}

interface Subscriber{
    def receive(event)
}

class PublisherSubscriberSpec extends Specification {
    def pub = new Publisher()
    def sub1 = Mock(Subscriber)
    def sub2 = Mock(Subscriber)

    def setup(){
        pub.subscribers<<sub1<<sub2  //往subscribers 列表中添加两个mock的Subscriber 的对象
    }

    def"delivers events to all subscribers"(){
        when:
        pub.send("Hello")
        pub.send("event2")

        then:
        //验证在publisher调用send时，两个subscribers 都应该被调用一次receive("Hello") 和.....

        1 * sub2.receive("Hello")
        1 * sub2.receive("event2")
        1 * sub1.receive("Hello")
        1 * sub1.receive("event2")
    }
}
