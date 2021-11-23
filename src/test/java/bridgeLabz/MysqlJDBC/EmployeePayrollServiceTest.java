package bridgeLabz.MysqlJDBC;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class EmployeePayrollServiceTest {

	@Test
	public void givenEmployeePayrollService_Retrieved_ShouldBeEqualToEmployeeCount(){
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        List<EmployeePayrollDetails> employeeDetails = employeePayrollService.retrieveData();
	        Assert.assertEquals(6, employeeDetails.size());
	    }

}
