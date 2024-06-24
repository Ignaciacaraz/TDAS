package tdadinamicas;

public class DicSimple {
	public class Nodo {
		int clave;
		int valor;
		Nodo siguiente;
	}
	Nodo primero;
	public void Inicializar() {
		primero=null;
	}
	public void Agregar(int valor, int clave) {
		Nodo nc = Clave2Nodo(clave);
		if(nc==null) {
			nc=new Nodo();
			nc.clave=clave;
			nc.siguiente=primero;
			primero=nc;
		}
		nc.valor=valor;
	}
	
	
	private Nodo Clave2Nodo(int clave) {
		Nodo aux=new Nodo();
		aux=primero;
		while(aux!=null && aux.clave!=clave) {
			aux=aux.siguiente;
		}
		return aux;
	}
	
	public void Eliminar(int clave) {
		if(primero.clave==clave) {
			primero=primero.siguiente;
		}
		else {
			Nodo aux=primero;
			while(aux.siguiente!=null && aux.siguiente.clave!=clave) {
				aux=aux.siguiente;
			}
			if(aux.siguiente!=null) {
				aux.siguiente=aux.siguiente.siguiente;
			}
		}
	}
	public int Recuperar(int clave) {
		Nodo nodo=Clave2Nodo(clave);
		return nodo.valor;
	}
	public Conjunto Claves() {
		Conjunto c=new Conjunto();
		c.inicializar();
		Nodo aux=primero;
		while(aux!=null) {
			c.agregar(aux.clave);
			aux=aux.siguiente;
		}
		return c;
	}
	
	public String toString() { 
	Nodo pivote; 
	 String out = "";
	 pivote = primero; 
	while (pivote != null) {
	 out = out + " " + pivote.valor; pivote =
	 pivote.siguiente;
	 }
	 return out;
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
	public Lista Mayores(int n, DicSimple dic, Lista lista) {
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DicSimple dic=new DicSimple();
		dic.Inicializar();
		dic.Agregar(5, 1);
		dic.Agregar(6, 2);
		dic.Agregar(8, 3);
		dic.Eliminar(2);
		System.out.println(dic);
		

	}
	
}
