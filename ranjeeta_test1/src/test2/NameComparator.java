package test2;

import java.util.Comparator;

public class NameComparator<T> implements Comparator<StudentInformation>{

	@Override
	public int compare(StudentInformation name1, StudentInformation name2) {
		return name1.name.compareTo(name2.name);
			
		}
	}


