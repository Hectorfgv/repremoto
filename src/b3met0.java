import java.util.Scanner;

public class b3met0 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		num = sc.nextInt();
		numero(num);
		
	}
	
	public static void numero (int num) {
		int a=num;
		if (a<0) {
		System.out.println("El número es negativo");
		}else System.out.println("El número es positivo");
		if (a==0) {
			System.out.println("El número es neutro");
		
		}
		
		

	}

}
