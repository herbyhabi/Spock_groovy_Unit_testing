import spock.lang.Specification

class HelloSpockSpec extends Specification {
    def "length of  Spock's and his friends's names"(){
        expect:
        name.size() ==length

        where:
        name | length
        "Spock" | 5
        "herby" | 5
        "gaga"  | 4
    }

}
