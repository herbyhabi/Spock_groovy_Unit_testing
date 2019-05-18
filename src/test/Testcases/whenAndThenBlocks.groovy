import spock.lang.Specification

class whenAndThenBlocks extends Specification {

    def "Test When and then"() {

        //setup block中会放置与这个测试函数相关的初始化程序
        // 在除了expect/then 块中使用断言，需要添加 assert 关键字
        setup:
        def stack = new Stack()
        assert stack.empty()
        def elem = "push me"

        //when中执行待测试的函数，when与then需要搭配使用，在when中执行待测试的函数，在then中判断是否符合预期
        when:
        stack.push(elem)

        //在then或expect块中会默认assert所有的返回值是布尔类型的
        then:
        assert !stack.empty()
        stack.size() ==1
        stack.peek() ==elem
    }
}
