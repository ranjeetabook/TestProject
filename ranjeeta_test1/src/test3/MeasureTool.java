package test3;


public class MeasureTool   {

	
	public long startTime(){
		System.out.println("Time starting in nano seconds");
		return System.nanoTime();
		
	}
	public long endTime(long startTime){
		long totalTimeTaken=0l;
		totalTimeTaken= (System.nanoTime() - startTime);
		return totalTimeTaken;
	}
	
	
}
