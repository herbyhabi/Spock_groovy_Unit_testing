import spock.lang.Specification
import spock.lang.Unroll

class SumTest extends Specification {

    def sum = new Sum()

    void setup() {
    }

    void cleanup() {
    }

    @Unroll //注释会将where子句的每个测试用例转化为一个 @Test 独立测试方法来执行
    def "Sum ( #num1 + #num2 = #theSum)"() {
        expect: sum.sum(num1, num2) == theSum

        where:
        num1 | num2 | theSum
        1    | 2    | 3
        3    | 3    | 6
        4    | 5    | 9
    }
}
