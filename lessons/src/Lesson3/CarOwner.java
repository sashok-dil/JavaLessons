package Lesson3;

public class CarOwner {
	
	private Car car;
	
	public CarOwner(Car car){
		this.car = car;
		System.out.println("� ���� ���� ������ "+car.getModel());
	}

	public void moveFromTo(int dist) {
		car.start();
		int d = car.drive(dist);
		car.stop();
		System.out.println("� ������ - "+ d);
	}
	
}
/* 1 ������� ����� ����, ������� ������ ����������� ���, � � ����� ����� ������ �������:
	//-����� ����� (�������������� �����, ����� ���������� �� 80)
	//- ����� ���� ��� (���)
	
//2 ���� 140-165
 */
