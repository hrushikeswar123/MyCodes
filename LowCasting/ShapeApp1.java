package com.kn.LowCasting;

public class ShapeApp1 {
	public static void main(String[] args) {
	       Shape sh=new Shape();
	       sh.Draw();
	       sh.calArea();
	      
	       
	       Rectangle1 r=new Rectangle1();
	       sh=r;
	       sh.Draw();
	       System.out.println(sh.calArea());
	       System.out.println(((Rectangle1) (sh)).calPerameter());
	       
	       Square1  s=new Square1();
	       sh=s;
	       sh.Draw();
	       System.out.println(sh.calArea());
	       System.out.println(((Square1) (sh)).calPerameter());
	      
	       Circle1 c=new Circle1();
	       sh=c;
	       sh.Draw();
	       System.out.println(sh.calArea());
	       
	       /*Down Casting  no Acess to parent reference
	        *  of the Child Specific Methods*/
	       System.out.println(((Circle1) (sh)).calPerameter());
		}

}
