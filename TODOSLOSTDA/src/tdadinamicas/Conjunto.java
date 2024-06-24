package tdadinamicas;

public class Conjunto {
	Nodo c;
	public void inicializar() {
		c=null;
	}
	public void agregar(int x) {
		if(pertenece(x)!=true) {
			Nodo nuevo=new Nodo();
			nuevo.setInfo(x);
			nuevo.setSig(c);
			c=nuevo;
		}
		
	}
	
	public void sacar(int x) {
		Nodo pivote=new Nodo();
		pivote=c;
		if(c.getInfo()==x) {
			c=c.getSig();
		}
		else {
			while(pivote.getSig()!=null &&pivote.getSig().getInfo()!=x) {
				pivote=pivote.getSig();
			}
			if(pivote.getSig()!=null) {
				pivote.setSig(pivote.getSig().getSig());
			}
		}
		
	}
	public int elegir() {
		return c.getInfo();
	}
	
	public boolean pertenece(int x) {
		Nodo pivote=new Nodo();
		pivote=c;
		while (pivote!=null && pivote.getInfo()!=x) {
			pivote=pivote.getSig();
		}
		return (pivote!=null);
	}
	public boolean conjuntovacio() {
		return (c==null);
	}

    public boolean Iguales(Conjunto a, Conjunto b) {
        Conjunto auxA = new Conjunto();
        auxA.inicializar();
        Conjunto auxB = new Conjunto();
        auxB.inicializar();

        // Verificar si todos los elementos de a están en b
        while (!a.conjuntovacio()) {
            int elemento = a.elegir();
            if (!b.pertenece(elemento)) {
                return false;
            }
            auxA.agregar(elemento);
            a.sacar(elemento);
        }

        // Restaurar el conjunto a
        while (!auxA.conjuntovacio()) {
            int elemento = auxA.elegir();
            a.agregar(elemento);
            auxA.sacar(elemento);
        }

        // Verificar si todos los elementos de b están en a
        while (!b.conjuntovacio()) {
            int elemento = b.elegir();
            if (!a.pertenece(elemento)) {
                return false;
            }
            auxB.agregar(elemento);
            b.sacar(elemento);
        }

        // Restaurar el conjunto b
        while (!auxB.conjuntovacio()) {
            int elemento = auxB.elegir();
            b.agregar(elemento);
            auxB.sacar(elemento);
        }

        return true;
    }
    
    public void Union(Conjunto a, Conjunto b) {
    	Conjunto c=new Conjunto();
    	while(!a.conjuntovacio()) {
    		int elegido=a.elegir();
    		c.agregar(elegido);
    		a.sacar(elegido);
    	}
    	while(!b.conjuntovacio()) {
    		int elegido=b.elegir();
    		c.agregar(elegido);
    		b.sacar(elegido);
    	}
    }
    public void Interceccion(Conjunto a, Conjunto b) {
    	Conjunto c=new Conjunto();
    	while(!a.conjuntovacio()) {
    		int elegido=a.elegir();
    		if(b.pertenece(elegido)) {
    			c.agregar(elegido);
    		}
    		a.sacar(elegido);
    	}
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
