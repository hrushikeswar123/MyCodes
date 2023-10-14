package com.kn.inheritance2;

public class InheritanceDemo {
	public static void main(String[] args) {
		ChefRobo chef=new ChefRobo("chitti","humanoid");
		System.out.println("name: "+chef.name+"Type: "+chef.type);
		chef .walk();
		chef.talk();
		chef.charging();
		chef.cook();
		DriverRobo Driver=new DriverRobo("chi","humanoid");
		System.out.println("name: "+Driver.name+"Type: "+Driver.type);
		Driver .walk();
		Driver.talk();
		Driver.charging();
		Driver.Drive();
		TeacherRobo Teacher=new TeacherRobo("ch","humanoid");
		System.out.println("name: "+Teacher.name+"Type: "+Teacher.type);
		Teacher .walk();
		Teacher.talk();
		Teacher.charging();
		Teacher.teach();
	}

}
