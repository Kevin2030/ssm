package com.xxx.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.ssm.config.CommonConstant;
import com.xxx.ssm.domain.Student;
import com.xxx.ssm.service.StudentService;
import com.xxx.ssm.utils.CommonUtil;
import com.xxx.ssm.utils.MessageHandleUtil;

@Controller
@RequestMapping("student")
public class StudentController {

	Logger log = LoggerFactory.getLogger(StudentController.class);

	private static final String SEARCHPAGE = "search";
	private static final String UPDATEPAGE = "update";
	private static final String INSERTPAGE = "insert";
	private static final String DELETEPAGE = "delete";

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "queryStudents", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public String queryStudents() {
		try {
			return studentService.queryStudents();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return MessageHandleUtil.returnJSONString(CommonConstant.ReturnCode.SERVICE_ERROR,
					CommonConstant.ReturnMessage.SERVICE_ERROR);
		}
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	@ResponseBody
	public String insert(String username, String password) {
		try {
			if (CommonUtil.isBlank(username, password)) {
				return MessageHandleUtil.returnJSONString(CommonConstant.ReturnCode.CLIENT_INPUT_ERROR,
						CommonConstant.ReturnMessage.CLIENT_INPUT_ERROR);
			}
			Student student = new Student();
			student.setUsername(username);
			student.setPassword(password);
			studentService.insertStudent(student);
			return MessageHandleUtil.returnJSONString(CommonConstant.ReturnCode.SUCCESS,
					CommonConstant.ReturnMessage.SUCCESS);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return MessageHandleUtil.returnJSONString(CommonConstant.ReturnCode.SERVICE_ERROR,
					CommonConstant.ReturnMessage.SERVICE_ERROR);
		}
	}

	@RequestMapping("searchPage")
	public String searchPage() {
		return SEARCHPAGE;
	}

	@RequestMapping("updatePage")
	public String updatePage() {
		return UPDATEPAGE;
	}

	@RequestMapping("insertPage")
	public String insertPage() {
		return INSERTPAGE;
	}

	@RequestMapping("deletePage")
	public String deletePage() {
		return DELETEPAGE;
	}

}
