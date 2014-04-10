package service;

import model.Student;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentServiceTest {

	@Test
	public void shouldGetAllThePassedStudents() {
		//given
		StudentService studentService = new StudentService();
		List<Student>  expectedStudents = newArrayList(
				new Student(2, "studentTwo",60, "famle"),
				new Student(3, "studentThree",70, "male"),
                new Student(4, "studentFour", 100, "famale"));
		//when
		List<Student> students = studentService.getAllPassedStudents();
		//then
		assertThat(students, is(expectedStudents));
	}

	@Test
	public void shouldGetAllStudents() {
		//given
		StudentService studentService = new StudentService();
		List<Student>  expectedStudents = newArrayList(
				new Student(1, "studentOne",50, "male"),
				new Student(2, "studentTwo",60, "famle"),
                new Student(3, "studentThree",70, "male"),
                new Student(4, "studentFour",100, "famle"));
		//when
		List<Student> students = studentService.getAllStudents();
		//then
		assertThat(students, is(expectedStudents));
	}

}
