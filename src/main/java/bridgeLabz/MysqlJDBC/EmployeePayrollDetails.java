package bridgeLabz.MysqlJDBC;

import java.time.LocalDate;

public class EmployeePayrollDetails {
	
	    private int id;
	    private String employeeName;
	    private char gender;
	    private LocalDate startDate;
	    private double salary;
	    private String address;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getEmployeeName() {
	        return employeeName;
	    }

	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }

	    public char getGender() {
	        return gender;
	    }

	    public void setGender(char gender) {
	        this.gender = gender;
	    }

	    public LocalDate getStartDate() {
	        return startDate;
	    }

	    public void setStartDate(LocalDate startDate) {
	        this.startDate = startDate;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setPhone(double salary) {
	        this.salary = salary;
	    }
	    
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String Address) {
	        this.address = Address;
	    }

	    @Override
		public String toString() {
			return "EmployeePayrollDetails [id=" + id + ", employeeName=" + employeeName + ", gender=" + gender
					+ ", startDate=" + startDate + ", salary=" + salary + ", address=" + address + "]";
		}
		
}
