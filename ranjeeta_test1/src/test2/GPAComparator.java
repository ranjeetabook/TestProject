package test2;



import java.util.Comparator;

public class GPAComparator implements Comparator<StudentInformation> {

	@Override
	public int compare(StudentInformation s1, StudentInformation s2) {
		if(s1.GPA==s2.GPA)  
			return 0;  
			else if(s1.GPA>s2.GPA)  
			return -1;  
			else  
			return 1;  
			}  
	}


