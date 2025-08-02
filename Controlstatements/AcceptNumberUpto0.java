package Controlstatements;
import java.util.Scanner;
public class AcceptNumberUpto0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = sc.nextInt();
			if(n==0)
				break;
		}
		System.out.println("Exiting....");
		sc.close();
	}

}
