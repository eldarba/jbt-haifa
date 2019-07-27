package aop.core.dao;

import org.springframework.stereotype.Component;

@Component
public class CompanyDao {

	private int compId;

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public void addCompany(int id) {
		System.out.println("company added to db");
	}

	public void deleteCompany() {
		System.out.println("company deleted from db");
	}

}
