import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduce el primer número");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = sc.nextInt();
		System.out.println("Los números son");
		numeros(num1, num2);
	} 
	
	public static void numeros (int a, int b) {
		int mayor = 0; int menor = 0;
		 if(a == b){
	            System.out.println("Datos iguales.");
	        }
	        else{
	            if(a > b){
	                mayor = a;
	                menor = b;
	            }
	            else{
	                mayor = b;
	                menor = a;
	            }
	        }
	        for (int i = menor; i <= mayor; i++) {
	            System.out.print(i + " ");
	        }
		
	}

}
