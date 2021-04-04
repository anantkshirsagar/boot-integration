package in.sb.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import in.sb.mybatis.model.Student;

@Mapper
public interface IStudentDAO {

	void addStudent(Student student);
}
