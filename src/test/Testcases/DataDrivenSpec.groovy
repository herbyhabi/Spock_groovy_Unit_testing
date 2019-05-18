import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class DataDrivenSpec extends Specification {
    def "maximum of two numbers" () {
        expect:
        Math.max(a, b) == c

        where:
        a<< [9,5,7 ]
        b<< [7,6,12]
        c<< [9,6,12]
    }

    def "#person.name is a #sex.toLowerCase() person"() {
        expect:
        person.getSex() == sex

        where:
        person                   || sex
        new Person(name: "Fred") || "Male"
        new Person(name:"Herby") || "Female"
    }

    static class Person{
        String name
        String getSex(){
            name =="Fred" ? "Male" : "Female"
        }


    }
}
