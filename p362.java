import java.util.Scanner;

public class p362 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int ncasos;
		ncasos = sc.nextInt();
		int dia;
		int mes;

		for(int i=1; i<=ncasos; i++){
			dia = sc.nextInt();	
			mes = sc.nextInt();	

	
		if(dia == 25){
			
		    if (mes == 12){
				System.out.println("SI");
				
		    } else {
				System.out.println("NO");
				
			}
		} else {
			System.out.println("NO");
		}
		}

	}
}
