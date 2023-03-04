package Ejercicio2;

public class Numero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Apartado a.
		float ingresos=0;
		int vehiculos=0, antiguedad=0, inmuebles=0;
		boolean embarcacion=false, aereonave=false, titularActivos=false;
		
		if(embarcacion==true || aereonave==true || titularActivos==true) {
			System.out.println("Pertenece al segmento iiii");
		}else {
			if(inmuebles>=3) {
				System.out.println("Pertenece al segmento iii");
			}else {
				if(vehiculos>=3 && antiguedad<5) {
					System.out.println("Pertenece al segmento ii");
				}else {
					if(ingresos<=409.083) {
						System.out.println("Pertenece al segmento i");
					}
				}
			}
		}
		
	}

}