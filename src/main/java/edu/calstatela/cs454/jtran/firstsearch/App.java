package edu.calstatela.cs454.jtran.firstsearch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try { 
    		String name = args[0];
    		System.out.println( "Hello " + name + "!" );
    	} catch (Exception ex){
    		System.out.println( "Hello World!" );
    	}
    }
}
