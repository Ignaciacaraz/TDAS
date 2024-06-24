package tdadinamicas;

public class Cola {
	Nodo primero;
	public void inicializar() {
		primero=new Nodo();
	}
	public void acolar(int x) {
		Nodo nuevo=new Nodo();
		nuevo.setInfo(x);
		
		Nodo pivote=new Nodo();
		pivote=this.primero;
		
		while(pivote.getSig()!=null) {
			pivote=pivote.getSig();
		}
		pivote.setSig(nuevo);
	}
	public void desarcolar() {
        primero.setSig(primero.getSig().getSig());

	}
	public int tope() {
		return (primero.getSig().getInfo());
	}
	
	public boolean vacio() {
		return (primero.getSig()==null);
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
		Cola cola=new Cola();
		cola.inicializar();
		cola.acolar(2);
		cola.acolar(3);
		cola.acolar(5);
		cola.acolar(6);
		cola.desarcolar();
	System.out.println(cola.tope());
		System.out.println(cola);

	}

}
