package myproject;

public class Hierarchy {

	public abstract class Transport
	{
		int width;
		int height;
		public abstract void move();
	}
	
	public abstract class AirTransport extends Transport
	{
		int maxHeight;
	}
	
	public abstract class RoadTransport extends Transport
	{
		int maxSpeed;
	}
	
	public class Car extends RoadTransport
	{
		String model;
		public Car(int width,int height,int maxSpeed,String model){
			this.width = width;
			this.height = height;
			this.maxSpeed = maxSpeed;
			this.model = model;
		}
		public void move(){/*move on road*/}
	}
	
	public class Plane extends AirTransport
	{
		String model;
		private int numberOfWings;
		public Plane(int width,int height,int maxHeight,String model){
			this.width = width;
			this.height = height;
			this.maxHeight = maxHeight;
			this.model = model;
		}
		public void move(){/*move in air*/}
		
		public int getNumberOfWings() {
			return numberOfWings;
		}
		public void setNumberOfWings(int numberOfWings) {
			this.numberOfWings = numberOfWings;
		}
	}
	
	
	
}
