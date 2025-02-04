package excep;
import static java.lang.Integer.*;
public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,res;
		num1=10;
		num2=0;
		try {
			res=num1/num2;	
		}
		catch(ArithmeticException e){
			System.out.println("number cannot be divided by zero");
		}

	}

}
