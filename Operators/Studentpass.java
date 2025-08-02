package Operators;
import java.util.Scanner;
public class Studentpass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int th = sc.nextInt();
      int pr = sc.nextInt();
      if(th>=40 && pr>=20)
      {
    	  System.out.println("Student is passed");

      }
      else
      {
    	  System.out.println("Student is Failed");
      }
      sc.close();
	}

}
