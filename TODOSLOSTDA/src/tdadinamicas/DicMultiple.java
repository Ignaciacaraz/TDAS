package tdadinamicas;

public class DicMultiple {
	public class Nodo {
		int clave;
		NodoVal valores;
		Nodo siguiente;
	}
	public class NodoVal{
		int valor;
		NodoVal siguiente;
		
	}
	Nodo primero;
	public void Inicializar() {
		primero=null;
	}
	public void Agregar(int clave, int valor) {
		Nodo nc=Clave2Nodo(clave);
		if (nc==null) {
			nc=new Nodo();
			nc.clave=clave;
			nc.siguiente=primero;
			primero=nc;
		}
		 
			NodoVal nuevo=new NodoVal();
			nuevo.valor=valor;
			nuevo.siguiente=nc.valores;
			nc.valores=nuevo;
			
		
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
	public void EliminarValor(int valor, int clave) {
		Nodo nc=Clave2Nodo(clave);
		if(nc.valores.valor==valor) {
			nc.valores=nc.valores.siguiente;
		}
		else {
			NodoVal aux=nc.valores;
			while(aux.siguiente!=null && aux.siguiente.valor!=valor) {
				aux=aux.siguiente;
			}
			if(aux.siguiente!=null) {
				aux.siguiente=aux.siguiente.siguiente;
			}
		}
	}
	public Conjunto Recuperar(int clave) {
		Nodo nc=Clave2Nodo(clave);
		Conjunto c=new Conjunto();
		c.inicializar();
		if(nc!=null) {
			NodoVal aux=nc.valores;
			while(aux!=null) {
				c.agregar(aux.valor);
				aux=aux.siguiente;
			}
		}
		return c;
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
	
	
	public Nodo Clave2Nodo(int clave) {
		Nodo aux=primero;
		while(aux!=null && aux.clave!=clave) {
			aux=aux.siguiente;
		}
		return aux;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
