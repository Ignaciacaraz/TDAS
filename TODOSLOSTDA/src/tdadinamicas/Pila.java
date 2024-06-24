package tdadinamicas;

public class Pila {
	Nodo primero;
	public void inicializar() {
		primero=null;
	}
	
	public void apilar(int x) {
		Nodo nuevo= new Nodo();
		nuevo.setInfo(x);
		nuevo.setSig(primero);
		primero=nuevo;
	}
	public void desapilar() {
		primero=primero.getSig();
	}
	public int primero() {
		return primero.getInfo(); 
	}
	public boolean vacio() {
		return (primero==null);
	}

	
	public String toString() { 
	Nodo pivote; 
	 String out = "";
	 pivote = primero; 
	while (pivote != null) {
	 out = out + " " + pivote.getInfo(); pivote =
	 pivote.getSig();
	 }
	 return out;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila pila =new Pila();
	System.out.println(pila.vacio());
		pila.apilar(2);
		pila.apilar(3);
		pila.apilar(5);
		pila.apilar(7);
		pila.desapilar();
		System.out.println(pila.vacio());

		System.out.println(pila);
	}

}
