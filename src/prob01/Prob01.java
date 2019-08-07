package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		System.out.print( "금액: " );
		int money = scanner.nextInt();
		
		int moneyType[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] moneyCount = new int[10];
		
		for(int i=0; i<=moneyType.length-1; i++) {
			moneyCount[i] = money/moneyType[i];
			money -= moneyType[i]*moneyCount[i];
		}
		
		for(int j=0; j<=moneyCount.length-1; j++) {
			System.out.println(moneyType[j]+"원 : "+ moneyCount[j]+"개");
		}
		scanner.close();
 	}
}