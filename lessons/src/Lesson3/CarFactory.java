package Lesson3;

public class CarFactory {
	
	private static String models[] = {"Audi", "Mersedes", "BMW"};

	public static void main(String[] args) {
		Car reno = new Car("Reno");
		reno.start();
		reno.stop();
		
		
		int dist = reno.drive(1000);
		System.out.println("Машина проехала "+dist);
		
		CarOwner owner = new CarOwner(reno);
		owner.moveFromTo(5000);
		for (int i = 0; i < models.length; i++) {
			Car allCar = new Car(models[i]);
			System.out.println(allCar.getModel());
		}
		
		AstinMartin asti = new AstinMartin("AstonMartin 87",1987);
		int d=asti.drive(1000);
		
		System.out.println("AstonMartin 87 Проехала: "+ d);
		

	}
}