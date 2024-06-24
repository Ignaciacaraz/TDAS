package tdas;

public class Conjunto {

	int [] conjunto;
	int cantidad;
	
	public void Inicializar() {
		conjunto=new int [100];
		cantidad=0;
	}
	
	public void Agregar(int x) {
		if(!this.Pertenece(x)) {
			conjunto[cantidad]=x;
			cantidad++;
		}
	}
	public void Sacar(int x) {
		int i=0;
		while(i<cantidad && conjunto[i]!=x) {
			i++;
		}
		if (i<cantidad) {
			conjunto[i]=conjunto[cantidad-1];
			cantidad--;
		}
	}
	public boolean Pertenece(int x) {
		int i=0;
		while (i<cantidad && conjunto[i]!=x) {
			i++;
		}
		return (i<cantidad);
	}
	public int Elegir() {
		return conjunto[cantidad-1];
	}
	public boolean ConjuntoVacio() {
		return(cantidad==0);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		}
}
