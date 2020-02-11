package calc;

import java.io.FileWriter;
import java.io.IOException;

import calc.Variables;

class Store extends Variables{
	char operation;
	int res;
	private FileWriter fw;

	Store(int first_num, int second_num,char c) {
		super(first_num, second_num);
		this.operation = c;
		// TODO Auto-generated constructor stub
	}
	 void setResult(int res) throws IOException
	 {
		 this.res = res;
		 fw = new FileWriter("hist.txt");
		 fw.append(operation);
		 fw.append((char)super.first_num);
		 fw.append((char)super.second_num);
		 fw.append("and result is");
		 fw.append((char)res);
		 
	 }
	
	

	
	

}
