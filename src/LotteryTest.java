public class LotteryTest {
	public static void main(String[] args) {
		
		Lottery lottery = new Lottery();
		
		System.out.println("Enter your Lottery Number:");
		lottery.userLotteryNumber();
		
		System.out.println("Lottery Number: ");
		lottery.LotteryNumber();
		
		//compare the lottery number and declare result
		if(lottery.compare() == 5)
			System.out.println("You won Grand Prize!!!!!!");
		else
			System.out.println("You Lose, Digits match " + lottery.compare());
	}
}
