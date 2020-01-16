import spock.lang.Specification

class SpockTest extends Specification{

    def "test" (){
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

    def "helloWorld" (){
        setup:
        Spock spock = new Spock()

        spock.helloWorld()
    }

    def "fizz" (){
        given:
        FizzBuzz subjectUnderTest = new FizzBuzz()

        when:
        def result = subjectUnderTest.fizzBuzz(3)

        then:
        assert result == "1 2 Fizz"
    }

}


