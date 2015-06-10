package com.xxx.ssm.persistence;

import java.util.List;

import com.xxx.ssm.domain.Student;

public interface StudentWrapper {

	/**
	 * 查询学生信息
	 * 
	 * @return
	 * @see
	 */
	List<Student> queryStudents();

	/**
	 * 增加学生信息
	 * 
	 * @return
	 * @see
	 */
	void insertStudent(Student student);

	/**
	 * 更新学生信息
	 * 
	 * @return
	 * @see
	 */
	void updateStudent(Student student);

	/**
	 * 删除学生信息
	 * 
	 * @return
	 * @see
	 */
	void deleteStudent(Student student);

}
