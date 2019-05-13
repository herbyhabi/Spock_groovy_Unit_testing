import spock.lang.Specification

class SumTest extends Specification {

    def sum = new Sum()

    void setup() {
    }

    void cleanup() {
    }

    def "Sum"() {
        expect: sum.sum(num1, num2) == theSum

        where:
        num1 | num2 | theSum
        1    | 2    | 3
        3    | 3    | 6
        4    | 5    | 9
    }
}
