package tdadinamicas;

public class Nodo {
	int info;
	Nodo sig;
	
	public Nodo(){
		this.sig=null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}
}

