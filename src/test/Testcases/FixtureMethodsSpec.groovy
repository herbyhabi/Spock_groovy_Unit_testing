import spock.lang.Specification

class FixtureMethodsSpec extends Specification {
    def setup(){
        System.out.println("Run before every feature method")
    }
    def cleanup(){
        System.out.println("run after every feature method")
    }
    def setupSpec(){
        System.out.println("run before the first method ")
    }
    def cleanupSpec(){
        System.out.println("run after last feature method ")
    }


    def "test 1"(){
        expect: true
    }
    def "test 2"(){
        expect: true
    }
}
