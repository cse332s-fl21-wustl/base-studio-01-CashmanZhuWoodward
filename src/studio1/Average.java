package studio1;
import java.util.Scanner;
public class Average {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n1  = in.nextInt();
		int n2 = in.nextInt();
		double sum = (n1 + n2);
		double average = (sum/2);
		System.out.print("Average of " + n1 + " and " + n2 + " is " + average);
		
	}

}
