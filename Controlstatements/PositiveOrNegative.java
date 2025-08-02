package Controlstatements;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     if(n>0)
     {
    	  System.out.println(n+" is a positive number");
     }
     else if(n==0)
     {
    	  System.out.println(n+" is 0");
     }
     else
     {
    	  System.out.println(n+" is a negative number");
     }
     sc.close();
	}

}
