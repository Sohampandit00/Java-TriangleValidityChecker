import java.util.Scanner;
public class playLottery
{
	public static void main(String[] args){
		Scanner myScan = new Scanner(System.in);
		int twoDigit = (int)Math.random() * 90 + 10;
		System.out.println("Enter a 2 digit number!");
		int enteredNumber = myScan.nextInt();
		int secondDigit = twoDigit%10;
		int firstDigit = twoDigit/10;
		if(twoDigit == enteredNumber){
		System.out.println("Congrats! You've won 10,000 dollars!");
		}else if(firstDigit == secondDigit && secondDigit == firstDigit){
		}else if(secondDigit == enteredNumber || firstDigit == enteredNumber){
		System.out.println("Congrats! You've won 1,000 dollars! You got 1 digit correct!");

		}else{
		System.out.println("Better luck next time");
		}


	}
}
