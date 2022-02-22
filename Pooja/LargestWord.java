import java.util.*;
public class LargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] s=sc.nextLine().split(" ");
		int maxLength = 0;
		String result="";
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>maxLength) {
				maxLength=s[i].length();
				result=s[i];
			}
		}
		System.out.println(result+" "+maxLength);
	}

}


//
//Coding Challenge
//1. Write a program to print the following
//	Input: a2b6c3
//	Output: aabbbbbbccc
//2. Write a program to print the inverse of the previous program
//	Input: aabbbbbbccc
//	Output: a2b6c3
//3. Write a program to sort the given sentence in alphabetical order
//	Input: welcome to sirius india team
//	output: india sirius team to welcome
//4. Program to find the length of the longest word in the given input
//	Input: welcome to sirius india team
//	Output: welcome  7
//5. Program to print the following pattern, Input will be number of rows
//	             1
//
//	            1 1
//
//	           1 2 1
//
//	          1 3 3 1
//
//	         1 4 6 4 1
//
//	     1 5 10 10 5 1
//
//	  1 6 15 20 15 6 1
//
//	1 7 21 35 35 21 7 1
//6. Find the number trailing zero's of the factorial of a number.
//	Input: 5! = 120 Output: 1