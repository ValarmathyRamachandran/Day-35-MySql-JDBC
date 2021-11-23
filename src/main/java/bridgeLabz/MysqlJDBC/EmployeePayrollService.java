package bridgeLabz.MysqlJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService {
	public static void main(String[] args) {
	        Connection con = null;
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	      	  	System.out.println("Driver loaded");
	      	  	con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user = root & password = Mathi@30 ");
	        } catch (
	                SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	            if (con != null) {
	                try {
	                    con.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return;
	    }

	    public void insertData(EmployeePayrollDetails details) {
	        try (Connection connection = getConnection()) {
	            Statement statement = connection.createStatement();
	            String sql = "insert into payroll_service.employee_payroll(EmployeeName,Gender,Salary,StartDate,Address) " +
	                    "values ('" + details.getEmployeeName() + "','" + details.getGender() + "'," +
	                    "'" + details.getStartDate() + "','" + details.getSalary() + "'," +
	                    "'" + details.getAddress() + "'); ";
	            int result = statement.executeUpdate(sql);
	            if (result == 1) {
	                System.out.println("Data inserted");
	            }
	        } catch (SQLException e) {
	            System.out.println(e);
	        }
	    }

	    public List<EmployeePayrollDetails> retrieveData() {
	        ResultSet resultSet = null;
	        List<EmployeePayrollDetails> employeeInfoList = new ArrayList<>();
	        try (Connection connection = getConnection()) {
	            Statement statement = connection.createStatement();
	            String sql = "select * from payroll_service.employee_payroll";
	            resultSet = statement.executeQuery(sql);
	            int count = 1;
	            while (resultSet.next()) {
	                count++;
	                EmployeePayrollDetails employeeDetails = new EmployeePayrollDetails();
	                employeeDetails.setId(resultSet.getInt("EmployeeId"));
	                employeeDetails.setEmployeeName(resultSet.getString("employeeName"));
	                employeeDetails.setGender(resultSet.getString("gender").charAt(0));
	                employeeDetails.setStartDate(resultSet.getDate("startDate").toLocalDate());
	                employeeInfoList.add(employeeDetails);
	            }
	        } catch (SQLException e) {
	            System.out.println(e);
	        }
	        return employeeInfoList;
	    	}
	    
	    public static  void updateSalary (int id, double salary) {
	    	
	    	try (Connection connection = getConnection()) {
	            Statement statement = connection.createStatement();
	            String query = "update payroll_service.employee_payroll set salary=" + salary + " where id=" + id + "";
	            int result = statement.executeUpdate(query);
	            if (result == 1)
	                System.out.println("Salary updated");
	        } catch (SQLException e) {
	            System.out.println(e);
	        }
	    	
	    }

		private static Connection getConnection() {
			// TODO Auto-generated method stub
			return null;
		}

}
