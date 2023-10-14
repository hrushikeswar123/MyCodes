package com.kn.Strings;

import java.io.*;
import java.util.*;

public class practice2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("k");
        String A=sc.next();
        String B=sc.next();
       
        /* Enter your code here. Print output to STDOUT. */
        int sum=A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)>0){
            System.out.println("yes");
        }
        else{
                System.out.println("No");
               
               System.out.println(capital(A)+" "+capital(B));
        }
    }
    static String capital(String s1){
        String s2=new String();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(0)>=97&&s1.charAt(0)<=122){
                s2=s2+(s1.charAt(0)-32);
            }
            else{
                s2=s2+s1.charAt(i);
            }
        }
        return s2;
    }
}



