import java.util.Scanner;

public class ejer0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2, res;
		System.out.println("Introduce el primer n�mero");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero");
		num2 = sc.nextInt();
		
		res = mayornum(num1, num2);
		System.out.println("El n�mero mayor es "+res);
	}
				
		public static int mayornum(int a, int b) {
			if (a<b) {
				return b;
			}else return a;
			
		}
				

	}


