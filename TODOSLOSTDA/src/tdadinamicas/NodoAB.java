package tdadinamicas;

public class NodoAB {
	int info;
	Arbol HijoIzquierdo;
	Arbol HijoDerecho;
	
	public NodoAB(int info) {
		this.info=info;
		this.HijoIzquierdo=new Arbol();
		this.HijoDerecho=new Arbol();
		
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Arbol getHijoIzquierdo() {
		return HijoIzquierdo;
	}

	public void setHijoIzquierdo(Arbol hijoIzquierdo) {
		HijoIzquierdo = hijoIzquierdo;
	}

	public Arbol getHijoDerecho() {
		return HijoDerecho;
	}

	public void setHijoDerecho(Arbol hijoDerecho) {
		HijoDerecho = hijoDerecho;
	}
}
