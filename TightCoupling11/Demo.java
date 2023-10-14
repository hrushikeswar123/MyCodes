package com.kn.TightCoupling11;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareEngineer se =new SoftwareEngineer();
		se.attendMeeting();
		se.writeTestCase();
		
		BackendEngineer be=new BackendEngineer();
		be.attendMeeting();
		be.doBackendProject();
		be.writeTestCase();
		
		DatabaseEng de=new DatabaseEng();
		de.attendMeeting();
		de.doDatbaseProject();
		de.learnSql();
		de.writeTestCase();
		
		JavaBE je=new JavaBE();
		je.attendMeeting();
		je.doBackendProject();
		je.learnJava();
		je.writeTestCase();
		
		PythonBE pe=new PythonBE();
		pe.attendMeeting();
		pe.doBackendProject();
		pe.learnpython();
		pe.writeTestCase();
	}

}
