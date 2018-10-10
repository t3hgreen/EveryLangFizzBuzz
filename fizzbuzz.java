import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0 && i % 5 == 0)
				System.out.println("fizzBuzz");
			else if(i % 3 == 0)
				System.out.println("fizz");
			else if(i % 5 == 0)
				System.out.println("buzz");
			else
				System.out.println(i);
		}
	}
}
