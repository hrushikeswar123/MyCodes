package com.kn.UpCasting;

public class ShapeApp {
	public static void main(String[] args) {
       Shape sh=new Shape();
       sh.Draw();
       sh.calArea();
      
       
       Rectangle r=new Rectangle();
       sh=r;
       sh.Draw();
       System.out.println(sh.calArea());
       
       
       Square  s=new Square();
       sh=s;
       sh.Draw();
       System.out.println(sh.calArea());
      
       
       Circle c=new Circle();
       sh=c;
       sh.Draw();
       System.out.println(sh.calArea());
	}
}
