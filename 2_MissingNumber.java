package assignment;
import java.util.Scanner;
import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of.elements:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		} 
        int[] missingNumbers = findMissingNum(arr);

        System.out.println("Missing numbers: " + Arrays.toString(missingNumbers));
    }

    public static int[] findMissingNum(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        
        boolean[] presenceArray = new boolean[max - min + 1];

        
        for (int num : arr) {
            presenceArray[num - min] = true;
        }
        int missingCount = 0;
        for (int i = min; i <= max; i++) {
            if (!presenceArray[i - min]) {
                missingCount++;
            }
        }

        
        int[] missingNum = new int[missingCount];
        int index = 0;

        
        for (int i = min; i <= max; i++) {
            if (!presenceArray[i - min]) {
                missingNum[index++] = i;
            }
        }

        return missingNum;
		
    }
}
