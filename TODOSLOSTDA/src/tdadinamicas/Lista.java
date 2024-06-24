package tdadinamicas;

public class Lista {
	Nodo primero;
	
	public Lista() {
		this.primero=new Nodo();
	}
	
	public void add(int x) {
		Nodo nuevo=new Nodo();
		nuevo.setInfo(x);
		
		Nodo pivote=new Nodo();
		pivote = primero;
		
		while(pivote.getSig()!=null) {
			pivote=pivote.getSig();
		}
		pivote.setSig(nuevo);
	}
	
	public void insert(int pos, int x) {
		int indice=0;
		Nodo pivote = new Nodo();
		pivote=primero.getSig();
		Nodo anterior= new Nodo();
		anterior=primero;
		Nodo nuevo = new Nodo();
		nuevo.setInfo(x);
		
		while (indice != pos) {
			anterior=pivote;
			pivote=pivote.getSig();
			indice++;
		}
		anterior.setSig(nuevo);
		nuevo.setSig(pivote);
		
	}
	
	public void remove(int pos) {
		int indice=0;
		Nodo pivote=new Nodo();
		Nodo anterior=new Nodo();
		
		pivote=primero.getSig();
		anterior=primero;
		while(indice!=pos) {
			anterior=pivote;
			pivote=pivote.getSig();
			indice++;
		}
		anterior.setSig(pivote.getSig());
	}
	public int get(int pos) {
		int indice=-1;
		Nodo pivote=new Nodo();
		pivote=primero;
		while(indice!=pos) {
			pivote=pivote.getSig();
			indice++;
		}
		return pivote.getInfo();
	}
	
    public int size() {
        int count = 0;
        Nodo pivote = primero.getSig();
        while (pivote != null) {
            count++;
            pivote = pivote.getSig();
        }
        return count;
    }
	public boolean vacia() {
		if (primero.getSig()==null) {
			return true;
		
		}
		else {return false;}
	}
	
	public String toString() { 
	Nodo pivote; 
	 String out = "";
	 pivote = primero.getSig(); 
	while (pivote != null) {
	 out = out + " " + pivote.getInfo(); pivote =
	 pivote.getSig();
	 }
	 return out;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista= new Lista();
		boolean r=lista.vacia();
		if (r==true) {System.out.println("true");}
		lista.add(2);
		lista.add(4);
		lista.insert(1, 3);
		boolean d=lista.vacia();
		if (d==true) {System.out.println("true");}
		else {System.out.println("false");}
		lista.remove(1);
		System.out.println(lista);
		System.out.println("valor de la posicion buscada= "+lista.get(1));
		System.out.println(lista.size());

	}
	
}
