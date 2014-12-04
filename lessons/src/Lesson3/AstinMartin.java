package Lesson3;

public class AstinMartin extends Car {
	
	private int year;
	
	public AstinMartin(String model, int year){
		super(model);
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
		public int drive (int howlong){
	
			return howlong*80;
	}
}
