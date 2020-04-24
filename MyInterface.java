interface MyInterface{
	    void display(String name,int empID);
	     String name2 ="Maveric";
	    
	}
	public class MyInterface   implements EmployeeDetails {

	 

	  
	    public void display(String name, int empID) 
	    {
	        System.out.println("The employee name is : " +name);
	        System.out.println("The employeeId is : " +empID);
	        
	    }
	     public static void main(String args[])
	     {
	    	 MyInterface obj = new MyInterface();
	         
	         obj.display("karthika", 3785);
	         
	         System.out.println(EmployeeDetails.name2);              
	 }
	}
	    
