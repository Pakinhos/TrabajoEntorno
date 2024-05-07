package metodos;

public class operaciones {

	
	//////EJERCICIO 1///////
	public static void tabla(int num) {
		
		int x=2;
		int x=3;
		
		for(int i=1; i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
	/////////////EJERCICIO 2/////////////
	public static boolean primo(int a)
	{
		boolean esPrimo=true;

		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				esPrimo=false;
				break;
			}
		}
		return esPrimo;
	}
	
	/////////////EJERCICIO 3/////////////
	
	public static boolean esPositivo(int x)
	{
		boolean positivo;
		if (x>=0)
		{
			positivo=true;
		}
		else
		{
			positivo=false;
		}
		return positivo;
	}
	
	public static int suma100(int x)
	{
		int suma=0;
		for(int i=x+1;i<=x+100;i++)
		{
			suma=suma+i;
		}
		return suma;
	}
	
	/////////////EJERCICIO 4/////////////
	public static int invertir(int x)
	{
		int numReves=0;
		while(x!=0)
		{
			numReves=numReves*10 + x % 10;
			x/=10;
		}
		return numReves;
	}
	
	/////////////EJERCICIO 5/////////////
	public static double suma(double x, double y)
	{
		double sum=0;
		sum=x+y;
		return sum;
	}
	
	public static double resta(double x, double y)
	{
		double res=0;
		res=x-y;
		return res;
	}
	
	public static double multiplicacion(double x, double y)
	{
		double mult=0;
		mult=x*y;
		return mult;
	}
	
	public static double division(double x, double y)
	{
		double div=0;
		div=x/y;
		return div;
	}
}
