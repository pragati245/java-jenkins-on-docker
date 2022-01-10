package com.example.java_jenkins_on_docker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(ifInputIsEven(22) );
    }
    
    public static boolean ifInputIsEven(int number) {
    	return  number % 2 == 0;  
    }
}
