package arrays;
import java.util.Scanner;
public class SixSubjectsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int arr[]= new int[6];
     for(int i=0;i<6;i++)
     {
    	 arr[i]=sc.nextInt();
     }int total=0;
     for(int i=0;i<6;i++)
     {
    	 total += arr[i];
     }
     int average=total/6;
     for(int i=0;i<6;i++)
    	 {
    	  System.out.println(arr[i]);
    	 }
     System.out.println(total);
     System.out.println(average);
     sc.close();
	}

}
