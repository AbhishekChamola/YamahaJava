import java.util.Scanner;

public class CarApplication {
	public static void main(String args[]) {
		Vehicle v;
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Menu----");
		System.out.println("1. to create Vehicle object");
		System.out.println("2. to display Car object");
		System.out.println("3. to create Convertible object");
		System.out.println("4. to create SportCar object");
		int choice = sc.nextInt();
			switch (choice) {
			case 1:
				v = new Vehicle();
				System.out.println("Enter Number Of wheels: ");
				int wheels = sc.nextInt();
				v.setNoOfWheel(wheels);

				System.out.println("Enter Number Of Passengers: ");
				int passenger = sc.nextInt();
				v.setNoOfPassengers(passenger);

				System.out.println("Enter Model Number: ");
				int model = sc.nextInt();
				v.setModel(model);
				sc.nextLine();

				System.out.println("Enter Make: ");
				String make = sc.nextLine();
				v.setMake(make);

				v.display();
				break;
			case 2:
				Car c = new Car();

				System.out.println("Enter number of Doors: ");
				int doors = sc.nextInt();
				c.setNoOfDoor(doors);

				c.display();
				break;
			case 3:
				Convertible conv = new Convertible();

				System.out.println("Is Car Convertible ? (true/false)");
				boolean head = sc.hasNext();
				conv.setHeadOpen(head);

				conv.display();

				break;

			case 4:
				SportCar scar = new SportCar();
				scar.display();
				break;
				
			default: System.out.println("Wrong choice...");	
			}
			
			sc.close();
		}
}
