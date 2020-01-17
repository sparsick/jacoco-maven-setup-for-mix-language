import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class FizzBuzzTest {

    @Test
    fun fizzBuzz() {
        val subjectUnderTest = FizzBuzz()

        val result: String = subjectUnderTest.fizzBuzz(5)

        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz")
    }

    @Test
    fun helloWorld() {
        val subjectUnderTest = KotlinCode()

        val result: String = subjectUnderTest.helloWorld()

        assertThat(result).isEqualTo("Hello World")
    }
}