package dao;

import model.Student;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class StudentDao {

	public List<Student> getAllStudent() {
		return newArrayList(new Student(1, "studentOne", 50, "male"),
				new Student(2, "studentTwo", 60, "famle"),
				new Student(3, "studentThree", 70, "male"),
                new Student(4, "studentFour", 100, "famale"));
	}
}
