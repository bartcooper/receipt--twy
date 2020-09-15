public class Register {
	public static void main (String[] args) {
		Transaction t1 = new Transaction();
		//constructor
		t1.Greet();
		int itemChoice = t1.Purchase();

		ReceiptPrinter r1 = new ReceiptPrinter();
		r1.print(itemChoice);
	}
}
