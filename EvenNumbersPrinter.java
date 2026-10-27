package edu.zuj.oop.week3.lecture1;

import java.util.Scanner;

public class Test1 {
   public static void main(String[] args) {
    
       Scanner s = new Scanner(System.in);
       
       System.out.println(" Enter n : ");
       int n = s.nextInt();
       for ( int i = 0 ; i < n ; i++ ){
       if ( i%2==0 ){
           System.out.println(i + " is Even ");
       } 
      }
    }
  }
