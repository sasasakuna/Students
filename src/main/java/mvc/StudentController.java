package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService = new StudentService();

	@RequestMapping(value = "/passedStudents", method = RequestMethod.GET)
	public String getPassedStudents(ModelMap model) {
		model.addAttribute("students", studentService.getAllPassedStudents());
		return "students";
	}

    @RequestMapping(value = "/allStudents", method = RequestMethod.GET)
    public String getAllStudents(ModelMap model) {
        model.addAttribute("allStudents", studentService.getAllStudents());
        return "students";
    }

}
