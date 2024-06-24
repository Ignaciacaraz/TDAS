package tdas;

public class Cola {
	
	int [] cola;
	int cantidad;
	
	public void InicializarCola() {
		cola=new int[100];
		cantidad=0;
	}
	public void Acolar(int x) {
		for (int j=cantidad-1; j>=0;j--) {
			cola[j+1]=cola[j];
		}
		cola[0]=x;
		cantidad++;
	}
	public void Desacolar() {
		cantidad--;
	}
	public int Primero() {
		return cola[cantidad-1];
	}
	public boolean ColaVacia() {
		return (cantidad==0);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
