package test3;

public class ExecutionClass {
	
	
	public ExecutionClass(){
		
	}
	
	public void doSomething(){
		final MeasureTool tool=new MeasureTool();
		long startTime=tool.startTime();
		String[] nameArray={"Ranjeeta",""};
		for(String name:nameArray){
			System.out.println("Name is" +name);
		}
		System.out.println("Timetaken to execute the whole method" + tool.endTime(startTime));
	}
	public static void main(String args[]){
		ExecutionClass excClass= new ExecutionClass();
		excClass.doSomething();
		
	}

}
