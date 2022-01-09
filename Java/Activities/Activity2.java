package Activities;
import java.util.*;
public class Activity2 {

	public static void main(String[] args) {
	   int[] Array1 = {10, 77, 10, 54, -11, 10};
	   System.out.println("Original Array is : " + Arrays.toString(Array1));
	   int searchnum = 10;
	   int fixedvalue = 30;
	   System.out.println("Result is: " + result(Array1, searchnum, fixedvalue));
	  
	}

public static boolean result(int[] numbers, int searchnum, int fixedvalue) {
    int temp_sum = 0;  
    for (int number : numbers) {       
        if (number == searchnum) {          
            temp_sum += searchnum;
        }
        if (temp_sum > fixedvalue) {
            break;
        }
    }
        return temp_sum == fixedvalue;
}
}
