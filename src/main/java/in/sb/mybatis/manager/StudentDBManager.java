package in.sb.mybatis.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sb.mybatis.dao.IStudentDAO;
import in.sb.mybatis.model.Student;

@RestController
@RequestMapping("/stud")
public class StudentDBManager {

	@Autowired
	private IStudentDAO studentDAO;

	@RequestMapping("/addStudent")
	public void addStudent() {
		studentDAO.addStudent(new Student(111L, "Kshirsagar", "MSC"));
	}

}
