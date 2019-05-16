import spock.lang.Specification


class Exception extends Specification {

    def stack = new Stack()

    //异常断言, 并获取抛出的异常对象
    def "assert throw exception"(){
        when:
        stack.pop()

        then:
        def e = thrown(EmptyStackException)
        e.cause == null
        stack.empty()
    }


    def "HashMap accepts null key" () {
        given:
        def map = new HashMap()

        when:
        map.put(null,"elem")

        then:
        notThrown(NullPointerException)
    }
}
