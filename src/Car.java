
public class Car
{
	
	private int topSpeed;
	private int mpg;
	private int tankSize;
	private int distanceTraveled;
	
	public Car(int topSpeed, int mpg, int tankSize)
	{
		this.topSpeed = topSpeed;
		this.mpg = mpg;
		this.tankSize = tankSize;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	public int getTankSize() {
		return tankSize;
	}
	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}
	
	public int getGallonsTillNextPitStop(int distanceTraveled)
	{
		return this.tankSize-(distanceTraveled/this.mpg);
		
	}
	
	public static void main(String[] args)
	{
		int n = 8;
		Car car1 = new Car(100, 20, 10);
		if(car1.getGallonsTillNextPitStop(40) == n)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		//Top speed is 100
		//MPG is at 22
		//Tanksize is 10
		
	}
}
