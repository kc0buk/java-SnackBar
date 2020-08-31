package snackBar;

public class Main
{
	private static void workWithData()
	{
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		// (String name, int quantity, double cost, int vendId)
		Snack chips = new Snack("Chips", 36, 1.75, 1);
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);
		Snack soda = new Snack("Soda", 24, 2.50, 2);
		Snack water = new Snack("Water", 20, 2.75, 2);

		jane.buySnacks(soda.getCost() * 3);
		soda.buySnack(3);
		System.out.println(jane.getName() + " cash on hand " + jane.getCash());
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

		jane.buySnacks(pretzel.getCost() * 1);
		pretzel.buySnack(1);
		System.out.println(jane.getName() + " cash on hand " + jane.getCash());
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

	}
	







	public static void main(String[] args)
	{
		workWithData();
	}
}