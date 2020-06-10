public class JavaCode {
    public String fizzBuzz(int number) {
        if (number <1 ) {
            return "zu klein!!!";
        }
        if (number >100 ) {
            return "zu groß!!!";
        }

        String result = "";
        for (int i = 1; i < number + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = result + " FizzBuzz";
            } else if (i % 3 == 0) {
                result = result + " Fizz";
            } else if (i % 5 == 0) {
                result = result + " Buzz";
            } else {
                result = result + " " + i;
            }
        }
        return result.trim();
    }
}
