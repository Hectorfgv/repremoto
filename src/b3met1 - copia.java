import java.util.Scanner;

public class b3met1 {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("Introduzca un n�mero entero");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Introduzca un n�mero entero");
		num2=sc.nextInt();
		numero(num1, num2);
		
		public static void numero (int a,int b) {
	
		
			if (a%b==0, b%a==0)
			{
				System.out.println(a+" Es  m�ltiplo de: "+b);
			}
			else
			{
				System.out.println(a+" No es  m�ltiplo de: "+b);
			}
		
		}
		
		

	}

}
