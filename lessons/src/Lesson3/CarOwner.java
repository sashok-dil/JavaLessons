package Lesson3;

public class CarOwner {
	
	private Car car;
	
	public CarOwner(Car car){
		this.car = car;
		System.out.println("У меня есть машина "+car.getModel());
	}

	public void moveFromTo(int dist) {
		car.start();
		int d = car.drive(dist);
		car.stop();
		System.out.println("Я поехал - "+ d);
	}
	
}
/* 1 Создать новый клас, который ьбудет наследовать кар, и в класе астон мартин создать:
	//-метод драйв (переопределить метод, будет умножаться на 80)
	//- новое поле год (инт)
	
//2 Шилд 140-165
 */
