package recursive;

public class FinalExercise {
    public static void main(String[] args) {
        FinalExercise02 finalExercise02 = new FinalExercise02();
        String result = finalExercise02.method(5);
        System.out.println(result);
    }
}

class FinalExercise01 {
    // Write a recursive method that accepts a number and then returns the sum of all of the digits in that
    //number. As an example an input of 4018 returns 13.
    public int method(int num) {
        String number = String.valueOf(num);
        int result = recursive(number, 0, 0);
        return result;
    }

    public int recursive(String num, int index, int sum) {
        if (index >= num.length()) {
            return sum;
        }
        int number = num.charAt(index) - '0';
        sum += number;
        return  recursive(num, index + 1, sum);
    }
}

class FinalExercise02 {
    // Write a method that accepts a number and then returns a String of ‘*’ forming a triangle as a String.
    public String method(int num) {
        String result = recursive(num, 0, "");
        return result;
    }
    public String recursive(int num, int index, String result) {
        if (index >= num) {
            return result;
        }
        String line = "";
        for (int i = 0; i < index + 1; i++) {
            line += "*";
        }
        line += "\n";
        return recursive(num, index+1, result+line);
    }
}

class FinalExercise03 {
    // Write a method to determine if an integer is a perfect number meaning that all of a numbers divisors
    // sum to that number. For example, the number 6 is perfect since its divisors 1, 2, and 3 sum to 6.
    public boolean method(int num) {
        if (num < 1) return false;
        int result = recursive(num, 1, 0);
        if (result == num) {
            return true;
        }
        return false;
    }

    public int recursive(int num, int current, int sum) {
        if (current > num / 2) {
            return sum;
        }
        if (num % current == 0) {
            sum += current;
        }
        return recursive(num, current+1, sum);
    }
}
