
public class RaceTest 
{

	public int lapRemain;
	
	
	public RaceTest(int lapRemain)
	{
		this.lapRemain=lapRemain;
		
	}
	
	
	
	public int getLapCount() {
		return lapRemain;
	}
	public void setLapCount(int lapRemain) {
		this.lapRemain = lapRemain;
	}
	
	
	public boolean winner()
	{
		if(this.lapRemain==0);
		{
			return true;
		} 
		
			
	}
	
		

	 

}
