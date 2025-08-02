package Controlstatements;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     
      {
    	  for(int j=1;j<=10;j++)
    	  {
    		  System.out.println(n+" x"+" "+j+" ="+" "+j*n);
    	  }
      }
	}

}
