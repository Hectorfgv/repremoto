import java.util.Scanner;

public class b3met0 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		num = sc.nextInt();
		numero(num);
		
	}
	
	public static void numero (int num) {
		int a=num;
		if (a<0) {
		System.out.println("El n�mero es negativo");
		}else System.out.println("El n�mero es positivo");
		if (a==0) {
			System.out.println("El n�mero es neutro");
		
		}
		
		

	}

}
