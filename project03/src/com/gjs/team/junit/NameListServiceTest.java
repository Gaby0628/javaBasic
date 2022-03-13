package com.gjs.team.junit;

import org.junit.Test;

import com.gjs.team.domain.Employee;
import com.gjs.team.service.NameListService;
import com.gjs.team.service.TeamException;

/**
 * 对NameListService类的测试
 * @Description 
 * @author shkstart  Email:shkstart@126.com
 * @version 
 * @date 2019年2月12日上午11:09:14
 *
 */
public class NameListServiceTest {

	@Test
	public void testGetAllEmployees(){
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for(int i = 0;i < employees.length;i++){
			System.out.println(employees[i]);
		}
	}
	
	@Test
	public void testGetEmployee(){
		NameListService service = new NameListService();
		int id = 1;
		id = 101;
		try {
			Employee employee = service.getEmployee(id);
			System.out.println(employee);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
