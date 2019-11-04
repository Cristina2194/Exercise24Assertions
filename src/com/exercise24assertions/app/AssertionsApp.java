package com.exercise24assertions.app;
import java.util.Scanner;

public class AssertionsApp 
{

	public static void main(String[] args) 
	{
		//Variables
		int edad=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Eres mayor de edad? Introduce tu edad");
		edad = input.nextInt();
		
		System.out.println(isMayorEdad(edad));
	}
		
	
	public static String isMayorEdad(int edad)
		{
			String cad="";	
			assert edad>0: "Edad NO Válida";
			if(edad<18)
			{
				cad = "Menor de edad";
			}
			if(edad>=18)
			{
				cad = "Eres chavorruco";
			}
			
			return cad;

		}
}


