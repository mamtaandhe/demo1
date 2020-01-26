package com.techie.spring.Git_Practice;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println(data);
		if(data.equals(ContantCls.DATA)){
			System.out.println("welcome");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    }
}
