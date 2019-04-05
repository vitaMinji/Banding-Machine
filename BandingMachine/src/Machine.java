import java.util.Scanner;

public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int drink, coin;
		Scanner scr = new Scanner(System.in);
		Admin admin = new Admin();
		
		int []array= {500,800,800,1000,1100};
		
		while(true) {
			System.out.println("Choose drink you want and put coins in the banding machine.");
			System.out.println("0.water   1.coke   2.cider   3.power ade   4.minit made");
			System.out.println("Drink you want :");
			
			drink = scr.nextInt();
			
			System.out.println("Coin you put int the machine :");
			
			coin = scr.nextInt();
			
			
			
			int check = admin.getDrink(drink);
			if(check==0) {

				for(int i=0; i<5; i++) {
					if(drink == i) {
						coin=coin-array[i];
					}
				}
				
				System.out.println("Change :" + coin);
			}
			
			
		}

	}

}
