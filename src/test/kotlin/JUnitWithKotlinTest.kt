import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class JUnitWithKotlinTest {

    @Test
    fun fizzBuzz() {
        val subjectUnderTest = JavaCode()

        val result: String = subjectUnderTest.fizzBuzz(15)

        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz")
    }

    @Test
    fun helloWorld() {
        val subjectUnderTest = KotlinCode()

        val result: String = subjectUnderTest.helloWorld()

        assertThat(result).isEqualTo("Hello World")
    }
}