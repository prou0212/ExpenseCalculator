import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	ArrayList<Expenses> expense = new ArrayList<Expenses>();

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;

		while (choice != 5) {
			try {
				System.out.print("Expense Tracker\n" + "1. Calculate monthly expenses\n" + "2. Show due dates for bills\n"
								+ "3. Enter new amount for monthly expense\n" + "4. Enter a new monthly expense\n"
								+ "5. Exit the program\n" + "Select one of the following: ");
				choice = keyboard.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Testing Option 1");
					break;
				case 2:
					System.out.println("Testing Option 2");
					break;
				case 3:
					System.out.println("Testing Option 3");
					break;
				case 4:
					System.out.println("Testing Option 4");
					break;
				case 5:
					System.out.println("Remember that this is the total amount that is owing");
					return;
				default:
					System.out.println();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public void addExpense(ArrayList<Expenses> expense) {
		expense.add(new Expenses("Rent", 600.00));
		expense.add(new Expenses("Cellphone", 100.00));
		expense.add(new Expenses("Television", 100.00));
		expense.add(new Expenses("Internet", 100.00));
		expense.add(new Expenses("Crave", 20.00));
		expense.add(new Expenses("Disney+ (Disney Plus)", 10.00));
		expense.add(new Expenses("Car Insurance", 215.00));
		expense.add(new Expenses("Property Taxes", 250.00));
		expense.add(new Expenses("Property Insurance", 250.00));
	}

	public void addDueDate() {

	}
}
