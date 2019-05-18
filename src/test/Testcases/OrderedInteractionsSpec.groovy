import spock.lang.Specification

/**
 * 可以用then指定他们的交互顺序。以下期望的交互顺序是先coll1，然后coll2
 */

class OrderedInteractionsSpec extends Specification {
    def "collaborators must be invoked in order"(){
        def coll1 = Mock(Collaborator)
        def coll2 = Mock(Collaborator)

        when:
        // try to reverse the order of these invocations and see what happens
        coll1.collaborate()
        coll2.collaborate()

        then:
        1 * coll2.collaborate()

        then:
        1 * coll1.collaborate()
    }

    interface Collaborator {
        def collaborate()
    }
}

