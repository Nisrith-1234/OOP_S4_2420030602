package arrays;
import java.util.Scanner;
public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]= new int[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      int max=0,min=arr[0];
      for(int i=0;i<n;i++)
      {
    	  if(max<arr[i])
    	  {
    		  max=arr[i];
    	  }
    	  if(min>arr[i])
    	  {
    		  min=arr[i];
    	  }
      }
      System.out.println(max+" is max element");
      
   
      System.out.println(min+" is minimum value");
	}

}
