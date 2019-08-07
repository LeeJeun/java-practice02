package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int minNumber = 1;
		int maxNumber = 100;
		int count=1;
		int inputNumber = 0;
		String answer = "";
		boolean gameStart = true;
		
		// 정답 랜덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요. 1-100");
		while(gameStart) {
			System.out.print(count+">>");
			inputNumber = scanner.nextInt();
			count+=1;
			
			if (inputNumber > correctNumber) {
				System.out.println("더 낮게");
				maxNumber = inputNumber;
				System.out.println(minNumber + "-" + maxNumber);
			} else if (inputNumber < correctNumber) {
				System.out.println("더 높게");
				minNumber = inputNumber;
				System.out.println(minNumber + "-" + maxNumber);
			} else {
				System.out.println("맞았습니다.");
				System.out.print("다시 하시겠습니까(y/n)");
				answer = scanner.next();
				if (answer.equals("y")) {
					System.out.println("수를 다시 결정하였습니다. 맞추어 보세요. 1-100");
					correctNumber = random.nextInt(maxNumber) + minNumber;
					minNumber=1;
					maxNumber=100;
					count=1;
				}else{
					System.out.println("게임을 종료합니다.");
					gameStart = false;
					scanner.close();
				}
			}
		}		
	}
}