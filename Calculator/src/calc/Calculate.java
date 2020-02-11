package calc;

import java.io.IOException;

import calc.Store;

class Calculate extends Store {
	char operation;
	int result;
	
	Calculate(int a,int b,char c)
	{
		super(a,b,c);
		operation = c;
	}
	
	void result(int a, int b,char c) throws IOException {
        int result;
        switch(c)
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
            	if(b==0) {
            		System.out.println("divide by zero exception");
            		result=-1;
            		break;
            	}
                result = a / b;
                break;
            default:
                System.out.printf("Enter a valid operator");
                return;
        }
        this.result = result;
        super.setResult(result);
        System.out.printf("%d %c %d = %d", a, c, b, result);
    }
		
}
	
	
	


