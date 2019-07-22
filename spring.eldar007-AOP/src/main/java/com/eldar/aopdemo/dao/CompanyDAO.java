package com.eldar.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class CompanyDAO {

	public void addCompany() {
		System.out.println(getClass().getSimpleName() + ": Adding a company to the database");
	}

}
