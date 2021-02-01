package com.epam.hometask.calculatorapp;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void add(double a , double b) {
		System.out.println(a+b) ;
	}
	public static void subtract(double a , double b) {
		System.out.println(a-b) ;
	}
	public static void multiply(double a , double b) {
		System.out.println(a*b) ;
	}
	public static void divide(double a , double b) {
		System.out.println(a/b) ;
	}
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in) ;
        double a = sc.nextDouble() ;
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        switch(op) {
        case '+' : add(a,b) ;
        			break ;
        case '-' : subtract(a,b) ;
        			break ;
        case '*' : multiply(a,b) ;
        			break ;
        case '/' : if(b!=0) {divide(a,b) ;}
        		   else {System.out.println("Divide by zero error will occur!");}
        			break ;
        default : System.out.println("Invalid operation") ;
        }
    }
}


