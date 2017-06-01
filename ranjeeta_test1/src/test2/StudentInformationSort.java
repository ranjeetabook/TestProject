package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInformationSort {

	public static void main(String[] args) {
		List<StudentInformation> listOfstudents = new ArrayList();
		listOfstudents.add(new StudentInformation(33, "Tina", 3.68));
		listOfstudents.add(new StudentInformation(85, "Louise", 3.85));
		listOfstudents.add(new StudentInformation(56, "Samil", 3.75));
		listOfstudents.add(new StudentInformation(19, "Samar", 3.75));
		listOfstudents.add(new StudentInformation(22, "Lorry", 3.76));
		
		for (StudentInformation std : listOfstudents)
			System.out.println("before sort: " + std);
		Collections.sort(listOfstudents, new StudentComparatorList(new GPAComparator(), 
				new NameComparator(),
				new StudentIdComparator())

		);
		for (StudentInformation std : listOfstudents)
			System.out.println("after sort: " + std);

	}

}
