import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
	
		Account BA1 = new Account("Roberts",1200);
	   BA1.printData();
	   
		SavingsAccount SA1= new SavingsAccount("Jones",1000,0.05);
		SA1.printData();
		
		CheckingAccount CA1 = new CheckingAccount("Biden",1800);
		CA1.deposit(100);
		CA1.deposit(100);
		CA1.deposit(100);
		CA1.deposit(100);
		
		CA1.printData();
		
		
        
        

	
		
	}

}
