package org.stjohn.list;

public class StudentSortByRollNo implements Comparator<CollegeStudent> {
	@Override
	public int compare(CollegeStudent o1, CollegeStudent o2) {
		// TODO Auto-generated method stub
		return o1.getRollNo()-o2.getRollNo();
	}

}
