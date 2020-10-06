package com.noman.cloning;

public class ShallowCloningDemo {
	
	public static void main(String [] args)
	{
		Employee e1 = new Employee(new JoiningDate("01", "10", "2013"),"1",10000);
		
		System.out.println("Hashcode of e1:"+ e1.hashCode());
		
		System.out.println("Hashcode of joining date of e1:"+ e1.joiningDate.hashCode());
		
		try {
			Employee e2=  (Employee) e1.clone();
			
			System.out.println("Hashcode of e2:"+ e2.hashCode());
			
			System.out.println("Date of joining of e2:"+ e2.joiningDate);
			
			System.out.println("Hashcode of joining date of e2:"+ e2.joiningDate.hashCode());
			
			System.out.println("Salary of e2 :"+ e2.salary);
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

}
