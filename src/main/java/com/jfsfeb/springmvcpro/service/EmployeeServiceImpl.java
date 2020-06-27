package com.jfsfeb.springmvcpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsfeb.springmvcpro.dao.EmployeeDAO;
import com.jfsfeb.springmvcpro.dto.EmployeeBean;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO empdao;

	public EmployeeBean getEmployeeByid(int Id) {
		// TODO Auto-generated method stub
		return empdao.getEmployeeByid(Id);
	}

	public boolean addEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return empdao.addEmployee(bean);
	}

	public boolean updateEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return empdao.updateEmployee(bean);
	}

	public boolean deleteEmployee(int Id) {
		// TODO Auto-generated method stub
		return empdao.deleteEmployee(Id);
	}

	public List<EmployeeBean> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeBean authenticate(int empId, String password) {
		// TODO Auto-generated method stub
		return empdao.authenticate(empId, password);
	}

}
