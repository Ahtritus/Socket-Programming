//calculator class
import java.util.StringTokenizer;

class calc
{
	double calculate(String exp)throws Exception
	{
		StringTokenizer s = new StringTokenizer(exp);
		
		double op1 = Double.valueOf(s.nextToken());
		char op = s.nextToken().charAt(0);
		double op2 = Double.valueOf(s.nextToken());
		
		switch(op){
			case '+':	return op1+op2;
			case '-':	return op1-op2;
			case '*':	return op1*op2;
			case '/':	return op1/op2;
						
		}
		return -1;
	}
}
		