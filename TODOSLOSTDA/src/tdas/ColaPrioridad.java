package tdas;

public class ColaPrioridad {
	
	int [] elementos;
	int[] prioridades;
	int cantidad;
	
	public void Inicializar() {
		elementos=new int[100];
		prioridades=new int[100];
		cantidad=0;
	}
	public void apilar(int x, int prioridad) {
		int j=cantidad -1;
		for(;prioridades[j]>=prioridad;j--) {
			
			elementos[j+1]=elementos[j];
			prioridades[j+1]=prioridades[j];
		}
		elementos[j+1]=x;
		prioridades[j+1]=prioridad;
	}
	public void Desapilar() {
		cantidad--;
	}
	public int Primero() {
		return elementos[cantidad-1];
	}
	public int Prioridad() {
		return prioridades[cantidad-1];
	}
	public boolean ColaVaci() {
		return (cantidad==0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
