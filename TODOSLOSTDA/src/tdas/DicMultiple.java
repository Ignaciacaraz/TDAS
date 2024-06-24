package tdas;

import tdadinamicas.Conjunto;
import tdadinamicas.DicSimple;
import tdadinamicas.Lista;

public class DicMultiple {
	public class Elemento {
		int []valores;
		int cantidadvalores;
		int clave;
	} 
	Elemento[]elementos;
	int cantidad;

	public void Inicializar() {
		elementos=new Elemento[100];
		cantidad=0;
	}
	public void Agregar(int valor, int clave) {
		int posicion=Clave2Indice(clave);
		if (posicion==-1) {
			posicion=cantidad;
			elementos[posicion]=new Elemento();
			elementos[posicion].clave=clave;
			elementos[posicion].valores=new int[100];
		}
		elementos[posicion].valores[cantidad]=valor;
		elementos[posicion].cantidadvalores++;
	}
	
	
	private void Eliminar(int clave) {
		int posicion=Clave2Indice(clave);
		if (posicion!=-1) {
			elementos[posicion]=elementos[cantidad-1];
			cantidad--;
		}
	}
	
	public void SacarValor(int valor, int clave) {
		int posicion=Clave2Indice(clave);
		if (posicion!=-1) {
			Elemento e = elementos[posicion];
			int posicionvalor=Valor2Indice(e, valor);
		if (posicionvalor!=-1) {
			e.valores[posicionvalor]=e.valores[cantidad-1];
			e.cantidadvalores--;
			if(e.cantidadvalores==0) {
				Eliminar(clave);
			}
		}}
		
	}
	public Conjunto RecuperarValores(int clave) {
		Conjunto c= new Conjunto();
		c.inicializar();
		int posicion=Clave2Indice(clave);
		if(posicion!=-1) {
		
		for (int i=0;i<cantidad;i++) {
			c.agregar(elementos[posicion].valores[i]);
		}
		}
		return c;
		
		
	}
	
	public Conjunto RecuperarClaves() {
		Conjunto conjunto=new Conjunto();
		conjunto.inicializar();
		for (int i = 0; i<cantidad;i++) {
			conjunto.agregar(elementos[i].clave);
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
	public int Valor2Indice(Elemento e,int valor) {
		int i = e.cantidadvalores;
		while(i>=i && e.valores[i]!=valor) {
			i--;
		}
		return i;
	}
	
	
	public Lista Pares(DicSimple dic, Lista lista) {
		Conjunto conjuntoclaves=dic.Claves();
		while(!conjuntoclaves.conjuntovacio()) {
			int elegir=conjuntoclaves.elegir();
			if(elegir%2==0) {
				lista.add(elegir);
			}
			conjuntoclaves.sacar(elegir);
		}
		return lista;
	}
	
	public Lista Mayores(int clave,int n, DicMultiple dic, Lista lista) {
		Conjunto valores=dic.RecuperarValores(clave);
		while(!valores.conjuntovacio()) {
			int numero=valores.elegir();
			if(numero>n) {
				lista.add(numero);
			}
			valores.sacar(numero);
		}
		return lista;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	}
		
}
