public class Transaction
	Scanner scan = new Scanner(System.in);
	public void greet(){
		System.out.println("Welcome!");
		System.out.println("Choose an item: ");
	}
	pubic void purchase(){
		int total = 0;
		boolean repeat = false
		while (repeat == false) {
			System.out.println("coffee(1), donut(2), or both(3)");
			int coice = scan.nextInt();
			if (choice==1)
				System.out.println("Here is your coffee. That will be $4.")
				total = total + 4;
				System.out.println("Would you like anything else?");
				String again = scan.nextString();
				if (again == No || again == no \\ again == NO) {
					repeat = false
				}
			}	
			else if (choice==2) {
				System.out.println("Here is your donut. That will be $3.")
				total = total + 3;
				System.out.println("Would you like anything else?");
				String again = scan.nextString();
				if (again == No || again == no \\ again == NO) {
					repeat = false
				}
			}
			else (choice==3) {
				System.out.println("Here is your coffee and your donut. That will be $6.")
				total = total + 4;
				System.out.println("Would you like anything else?");
				String again = scan.nextString();
				if (again == No || again == no \\ again == NO) {
					repeat = false
				}
			}
		}

