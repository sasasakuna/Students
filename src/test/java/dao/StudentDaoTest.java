package dao;

import model.Student;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentDaoTest {

	@Test
	public void shouldGetAllStudents() {
		//given
		StudentDao studentDao = new StudentDao();
		//when
		List<Student> allStudent = studentDao.getAllStudent();
		//then
		assertThat(allStudent.size(), is(4));
		assertThat(allStudent.get(0).getName(), is("studentOne"));
		assertThat(allStudent.get(0).getGrade(), is(50.0));
	}
}
