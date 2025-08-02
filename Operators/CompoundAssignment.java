package Operators;
import java.util.Scanner;
public class CompoundAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n+=1;
		System.out.println("after incremented using compound assignment operator by 1: "+n);
		n-=1;
		System.out.println("after decremented by 1: "+n);
		n*=2;
		System.out.println("after multiplied by 2: "+n);
		n/=2;
		System.out.println("after getting divided by 2: "+n);
		sc.close();
	}

}
