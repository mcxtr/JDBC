package org.example;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        CompanyRepository companyRepository = new CompanyRepository();
        companyRepository.create();
        Company company = new Company("it.kg","Coder's");
        companyRepository.save(company);
    }
}
