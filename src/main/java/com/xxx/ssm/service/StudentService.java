package com.xxx.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxx.ssm.config.CommonConstant;
import com.xxx.ssm.domain.Student;
import com.xxx.ssm.persistence.StudentWrapper;
import com.xxx.ssm.utils.MessageHandleUtil;

@Service
public class StudentService {

	@Autowired
	private StudentWrapper studentWrapper;

	/**
	 * 查询学生信息
	 * 
	 * @return
	 * @see
	 */
	public String queryStudents() {
		List<Student> students = studentWrapper.queryStudents();
		return MessageHandleUtil.returnJSONString(CommonConstant.ReturnCode.SUCCESS,
				CommonConstant.ReturnMessage.SUCCESS, students);
	}

	/**
	 * 添加学生信息
	 * 
	 * @param student
	 * @see
	 */
	@Transactional
	public void insertStudent(Student student) {
		studentWrapper.insertStudent(student);
	}

	/**
	 * 更新学生信息
	 * 
	 * @param student
	 * @see
	 */
	@Transactional
	public void updateStudent(Student student) {
		studentWrapper.updateStudent(student);
	}

	/**
	 * 删除学生信息
	 * 
	 * @param student
	 * @see
	 */
	@Transactional
	public void deleteStudent(Student student) {
		studentWrapper.deleteStudent(student);
	}

}
