package tdas;

public class DicSimple {
	public class Elemento {
		int valor;
		int clave;
	}
	Elemento[]elementos;
	int cantidad;
	
	public void Inicializar() {
		elementos=new Elemento[100];
		cantidad=0;
	}
	public void Agregar(int clave, int valor) {
		int posicion=Clave2Indice(clave);
		if (posicion==-1) {
			posicion=cantidad;
			elementos[posicion]=new Elemento();
			elementos[posicion].clave=clave;
		}
		elementos[posicion].valor=valor;
		
	}
	public void Sacar(int x) {
		int posicion=Clave2Indice(x);
		if (posicion!=-1) {
			elementos[posicion]=elementos[cantidad-1];
			cantidad--;
		}
	}
	public int Recuperar(int x) {
		int posicion=Clave2Indice(x);
		return elementos[posicion].valor;
	}
	public Conjunto Claves() {
		Conjunto conjunto=new Conjunto();
		conjunto.Inicializar();
		for (int i = 0; i<cantidad;i++) {
			conjunto.Agregar(elementos[i].clave);
		}
		return conjunto;
	}
	public int Clave2Indice(int x) {
		int i =cantidad-1;
		
		while (i>=0 && elementos[i].clave!=x) {
			i--;
		}
		return i;
	}
}
