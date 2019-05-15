import spock.lang.Specification

class PublisherSpec extends Specification {

    def "Test When and then"() {

        //setup block中会放置与这个测试函数相关的初始化程序
        setup:
        def stack = new Stack()
        def elem = "push me"

        //when中执行待测试的函数，when与then需要搭配使用，在when中执行待测试的函数，在then中判断是否符合预期
        when:
        stack.push(elem)

        then:
        !stack.empty()
        stack.size() ==1
        stack.peek() ==elem
    }
}
