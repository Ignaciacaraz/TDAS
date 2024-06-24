package tdas;

public class Pila {

	int [] pila;
	int cantidad;
	
	public void Inicializar() {
		pila=new int[100];
		cantidad=0;
	}
	public void Apilar(int x) {
		pila[cantidad]=x;
		cantidad++;
	}
	public void Desapilar() {
		cantidad--;
	}
	public int tope() {
		return pila[cantidad-1];
	}
	public boolean PilaVacia() {
		return (cantidad==0);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
