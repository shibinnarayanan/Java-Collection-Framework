package com.svv7.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getId() == o2.getId()) {
			//return 0; only compare id here
			return o1.getName().compareTo(o2.getName());// if 2 objects have same id then again do compare based on name
		}
		if (o1.getId() > o2.getId()) {
			return 1;
		} else
			return -1;
	}

}
