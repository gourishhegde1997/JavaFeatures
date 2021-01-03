package java8features.lambda.functions;

import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorQuiz {
    //main
    public static void main (String pars[]) {
    	Scanner scanner = new Scanner(System.in);
    	Integer int1 = scanner.nextInt();
    	Integer int2 = scanner.nextInt();
    	
        // call evaluate for adding two int values
    	System.out.println(evaluate(int1, int2, (Int1, Int2) -> Int1 + Int2));
    	
        // call evaluate for subtracting two int values
    	System.out.println(evaluate(int1, int2, (i, j) -> Math.abs(i - j)));
    	
        // call evaluate for multiplying two int values
    	System.out.println(evaluate(int1, int2, (i, j) -> i * j));
    	
    	
    	scanner.close();
    }

    public static Integer evaluate(Integer t, Integer u, BiFunction<Integer, Integer, Integer> fn) {
        return fn.apply(t, u);
    }
}

