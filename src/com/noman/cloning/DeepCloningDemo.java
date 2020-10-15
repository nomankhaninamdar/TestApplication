package com.noman.cloning;

public class DeepCloningDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Noman",1,new JoiningDate("01", "06", "2004"));
		
		System.out.println("HashCode of s1:"+s1.hashCode());
		
		System.out.println("HashCode of s1.joiningate:"+s1.colegeJoiningDate.hashCode());
		
		try {
			Student s2 = (Student)s1.clone();
			
			System.out.println("HashCode of s2:"+s2.hashCode());
			
			System.out.println("HashCode of s2.joiningate:"+s2.colegeJoiningDate.hashCode());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
