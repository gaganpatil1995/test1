package com.masai.Dao;

import javax.persistence.EntityManager;

import com.masai.EntityClass.Employee;
import com.masai.Util.EM_Util;

public class EmployeeDaoImpl implements EmployeDao {

	@Override
	public String getAddressOfEmploye(int empId) {
        String address = null  ;
		
		EntityManager em = EM_Util.provideEntityManager();
		Employee e1 = em.find(Employee.class, empId) ;
		if(e1 !=null) {
		address = e1.getAddress();
		}else {
			address = "Employee id is Invalid" ;
		}
		
		return address ;
	}

	

}
