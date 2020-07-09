package StreamAPI;

import java.util.function.BiFunction;
import java.util.function.Function;	

public class ForEachMethod {

	public static void main(String[] args) {

		//Function example
		System.out.println("The result from Function is : " + addANdMul.apply(8));
		
		//Bifunction Example
		System.out.println("The result from BiFunction is : " + addAndMulBi.apply(8, 5));

	}
	
	//Functions example
	static Function<Integer, Integer> addOneFunc = number -> number + 1;
	
	static Function<Integer, Integer> mulFiveFunc = number -> number * 5;
	
	static Function<Integer, Integer> addANdMul = addOneFunc.andThen(mulFiveFunc);	

	//Bifunctions example
	static BiFunction<Integer, Integer, Integer> addAndMulBi = (num1, num2) -> (num1 + 1) * num2;
}
