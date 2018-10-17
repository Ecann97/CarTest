
public class Track {
	private int trackLength;
	private int lapCount;
	
	public Track(int trackLength, int lapCount)
	{
		this.trackLength = trackLength;
		this.lapCount = lapCount;
	}
	
	public int getTrackLength() {
		return trackLength;
	}
	public void setTrackLength(int trackLength) {
		this.trackLength = trackLength;
	}
	public int getLapCount() {
		return lapCount;
	}
	public void setLapCount(int lapCount) {
		this.lapCount = lapCount;
	}
	
	public int getTotalMilesTraveled()
	{
		return this.getTrackLength()*this.getLapCount();
	}

}
