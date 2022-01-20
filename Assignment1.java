import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Scanner Object Construction
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble(); 
		System.out.println("Enter Promo Code: ");
         int promoCode = scanner.nextInt();
		
		  scanner.close();
		  System.out.println("Amount is: "+amount);
		  System.out.println("Promo Code is: "+promoCode);
		  
		// 2 Promo Codes :)
			
			int JUMBO = 101;   // Flat 50% off for the items worth 200 or more
			int ZOMHELLO = 201; // Flat 60% off for the items worth 159 or more upto 120
			double discount = 0;
			int apply = (promoCode == JUMBO || promoCode == ZOMHELLO)?promoCode:promoCode ;
			System.out.println("The applied promocode value is :"+apply);
            switch (apply) {
            
			case 101:	
				
				if(amount >= 200) {
					discount = 0.5 * amount;
					System.out.println("Discount is: "+discount);
					System.out.println("Promo Code JUMBO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(200-amount)+" more");
				}
				
				break;
				
			case 201:
				
				if(amount >= 159) {
					discount = 0.6 * amount;
					
					if(discount >= 120) {
						discount = 120;
					}
					
					System.out.println("Discount is: "+discount);
					
					System.out.println("Promo Code ZOMHELLO Applied Successfully");
				}else {
					System.out.println("Amount is Lesser. Please add items worth "+(159-amount)+" more");
				}
				
				break;
				
				default:
				System.out.println("Invalid Promo Code");
				System.out.println("the entered promocode is wrong please enter a valid promocode from the choices(JUMBO =101 OR ZOMHELLO = 2012)");
				
		}
		if(apply == 101 || apply == 201) {
		amount -= discount;
		System.out.println("Please Pay: \u20b9"+amount);
	}else {
		System.out.println("enetr valid promocode from the above choices");
	}

}}
