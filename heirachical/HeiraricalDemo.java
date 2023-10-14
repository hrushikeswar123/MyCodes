package com.kn.heirachical;

public class HeiraricalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer d1=new Developer();
		d1.empId=1112;
		d1.name="AAB";
		System.out.println("Id: "+d1.empId+" Name: "+d1.name);
		
		Manager m1=new Manager();
		m1.empId=1113;
		m1.name="AAC";
		System.out.println("Id: "+m1.empId+" Name: "+m1.name);
		
		
		TestEngineer t1=new TestEngineer();
		t1.empId=1114;
		t1.name="AAD";
		System.out.println("Id: "+t1.empId+" Name: "+t1.name);
		
		TeamLead tl1=new TeamLead();
		tl1.empId=1115;
		tl1.name="AAE";
		System.out.println("Id: "+tl1.empId+" Name: "+tl1.name);
	}

}
