package assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment1 {      //iam taken class name as Assignment1 in eclipse

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of.elements:");
		int n=sc.nextInt();
		int arrNum[] = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arrNum[i]=sc.nextInt();
		}
		try {
			cumulativeMultiple(arrNum);
            System.out.println("Output: arrNum = " + Arrays.toString(arrNum));
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
	}
	private static void cumulativeMultiple(int[] arrNum) {
		for(int j=0;j<arrNum.length;j++) {
			if(j==0) {
				arrNum[j]=arrNum[0];
			}
			else {
				arrNum[j]=arrNum[j-1]*arrNum[j];
			}
		}
	}
	

}
