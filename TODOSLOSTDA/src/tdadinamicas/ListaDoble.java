package tdadinamicas;

public class ListaDoble {
	
	public class NodoD{
		int info;
		NodoD sig;
		NodoD ant;
		
		public NodoD(){
			this.sig=null;
			this.ant=null;
		}
		
		public int getInfo() {
			return info;
		}
		public void setInfo(int info) {
			this.info = info;
		}
		public NodoD getSig() {
			return sig;
		}
		public void setSig(NodoD sig) {
			this.sig = sig;
		}
		public NodoD getAnt() {
			return ant;
		}
		public void setAnt(NodoD ant) {
			this.ant = ant;
		}	
	}
	
	NodoD primero;
	public ListaDoble() {
		this.primero=new NodoD();
	}
	
	
	public Boolean ListaVacia() {
		if (primero.sig==null) {
			return true;
		}
		else {return false;}
	}
	
	public void Agregar(int x) {
		NodoD nuevo=new NodoD();
		nuevo.setInfo(x);
		NodoD pivote=new NodoD();
		pivote=primero;
		while(pivote.getSig()!=null) {
			pivote=pivote.getSig();
		}
		pivote.setSig(nuevo);
		nuevo.setAnt(pivote);
	}
	
	public void Eliminar1(int x) {
		NodoD pivote=new NodoD();
		pivote=primero;
		while(pivote.getInfo()!=x) {
			pivote=pivote.getSig();
		}
		NodoD anterior=pivote.getAnt();
		NodoD siguiente=pivote.getSig();
		anterior.setSig(siguiente);
		if (siguiente!=null) {
		siguiente.setAnt(anterior);
		}
	}

	public void Eliminartodos(int x) {
	    NodoD pivote = primero; 

	    while (pivote != null) {
	        if (pivote.getInfo() == x) {
	            NodoD anterior = pivote.getAnt();
	            NodoD siguiente = pivote.getSig();
	            
	            anterior.setSig(siguiente);
	            if (siguiente != null) {
	                siguiente.setAnt(anterior);
	            }
	        }
	        pivote = pivote.getSig();
	    }
	}
	
	public int Buscar(int x) {
		int indice=0;
		NodoD pivote=new NodoD();
		pivote=primero.getSig();
		while(pivote.getInfo()!=x) {
			indice++;
			pivote=pivote.getSig();
		}
		return indice;
	}


	
	
	public String toString() { 
		NodoD pivote; 
		 String out = "";
		 pivote = primero.getSig(); 
		while (pivote != null) {
		 out = out + " " + pivote.getInfo(); 
		 pivote = pivote.getSig();
		 }
		 return out;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDoble lista=new ListaDoble();
		lista.Agregar(2);
		lista.Agregar(5);
		lista.Agregar(3);
		lista.Eliminar1(3);
		System.out.println(lista.Buscar(5));
		System.out.println(lista);
	}

}
