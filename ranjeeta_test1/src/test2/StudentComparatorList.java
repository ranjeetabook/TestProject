package test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentComparatorList implements Comparator<StudentInformation> {
  private List<Comparator<StudentInformation>> comparatorList;
  public StudentComparatorList(Comparator<StudentInformation>... comparators) {
      this.comparatorList = Arrays.asList(comparators);
  }
 
	@Override
	public int compare(StudentInformation sf1, StudentInformation sf2) {
		for (Comparator<StudentInformation> comparator : comparatorList) {
            int result = comparator.compare(sf1, sf2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
	}
	

