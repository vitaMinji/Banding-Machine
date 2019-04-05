
public class Admin {
	int []drinks = {2,2,2,2,2};
	int check=0;
	
	Admin(){
		
	}
	
	Admin(int number){
		
	}
	
	public int getDrink(int number){
			
		if(drinks[number]!=0) {
			drinks[number]--;
			return 0;
		}else {
			System.out.println("Stock is gone!! I'm put 2 drink now. so try one more time plz");
			drinks[number]=drinks[number]+2;
			return 1;		
		}		
	}
			
}
