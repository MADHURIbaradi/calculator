package calc;
import java.io.IOException;
import java.util.Scanner;

import calc.Calculate; 

public class CalcUI extends Calculate {

	private static Scanner input;

	CalcUI(int a, int b, char c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	
	void result(int a,int b,char c) throws IOException {
		super.result(a, b, c);
	}
	
	public static void main(String[] args) throws IOException {
        input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        CalcUI c = new CalcUI(num1,num2,operator);
        c.result(num1,num2,operator);
        
	}

}
