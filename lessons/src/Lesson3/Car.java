package Lesson3;

public class Car { 
	
	private String model;
	
	
	public Car(String modelNewCar){
		model = modelNewCar;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public void start() {
		System.out.println("������ ���������");
	
	}
	
	public void stop(){
		System.out.println("������ ������������");
	}
	
	public int drive (int howlong){
		int i = howlong*60;
		return i;
	}
	
	public String getModel(){
		return model;
	}

	
}
