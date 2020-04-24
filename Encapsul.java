
public class Encapsul {

class Employee {

private String empName;
   private String companyName;
  
public String getEmpName() {
   return empName;
}
public void setEmpName(String empName) {
   this.empName = empName;
}

public String getCompanyName() {
   return companyName;
}
public void setCompanyName(String companyName) {
   this.companyName = companyName;
}

}

public class Encapsulation{
public static void main(String[] args) 
{
	
    Employee emp=new Employee();
    emp.setEmpName("Karthika");
    emp.setCompanyName("Maveric");
System.out.println(" Employee name is " +emp.getEmpName()  + " company name is " +emp.getCompanyName());
	}

}}

/* output: empName is : karthika CompanyName is :Maveric*/
