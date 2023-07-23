package assignment;

import java.util.Scanner;

public class SingularSocks {

    public static int countSinSocks(int[] socksData) {
        int singularSocksCount = 0;

        for (int numPairs : socksData) {
            if (numPairs % 2 == 1) {
                singularSocksCount++;
            }
        }

        return singularSocksCount;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements:");
		int n=sc.nextInt();
		int sData[] = new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			sData[i]=sc.nextInt();
		}
        int result = countSinSocks(sData);
        System.out.println("singular socks: " + result);
    }
}
