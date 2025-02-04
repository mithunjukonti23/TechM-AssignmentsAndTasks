package org.anurag;
class Employee {
	
	private int empID;
	private String empName;
	private int sal;
	private int exp;
	public void setEmployeeDetails(int empID,String empName,int sal,int exp) {
	this.empID=empID;
	this.empName=empName;
	this.sal=sal;
	this.exp=exp;
	}
	public void getEmployeeDetails() {
		System.out.println("employee id    : "+empID);
		System.out.println("employee name  : "+empName);
		System.out.println("employee salary: "+sal);		
	}
	public void getLoanEligibility()
	{
		if(exp>5) {
			if(sal>600000) {
				System.out.println("employee is eligible to get loan");
				if(sal==600000) {
					System.out.println("Loan granted is 2 lakhs");
				}
				else if(sal>=1000000 && sal<1500000){
					System.out.println("Loan granted is 5 lakhs");
				}
				else {
					System.out.println("Loan granted is 7 lakhs");
				}
			}
			else {
				System.out.println("not eligible");
			}
		}
		else {
			System.out.println("not eligible");
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEmployeeDetails(1,"mithun",1600000,6);
		e1.getEmployeeDetails();
		e1.getLoanEligibility();
	}
}
