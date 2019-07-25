package aop.core.dao;

import java.util.ArrayList;
import java.util.List;

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

	public List<Company> readAllCompanies() {

		if (Math.random() < 0.5) {
			throw new RuntimeException("CompanyDao.readAllCompanies() failed");
		}

		List<Company> companies = new ArrayList<Company>();
		companies.add(new Company(101, "AAA"));
		companies.add(new Company(102, "BBB"));
		companies.add(new Company(103, "CCC"));
		return companies;
	}

}
