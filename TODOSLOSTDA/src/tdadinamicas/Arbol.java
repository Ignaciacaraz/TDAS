package tdadinamicas;

public class Arbol {
	NodoAB raiz;
	public Arbol() {
		this.Inicializar();
	}
    public boolean EsVacio() {
        return (this.raiz == null);
    }
	public void Inicializar() {
		raiz=null;
	}
	public Arbol HijoIzquierdo() {
		return this.raiz.getHijoIzquierdo();
	}
	public Arbol HijoDerecho() {
		return this.raiz.getHijoDerecho();
	}
	public int Raiz() {
		return this.raiz.getInfo();
	}
	
	public void Agregar(int x) {
		if(this.EsVacio()) {
			this.raiz=new NodoAB(x);
		}
		else {
			if(this.Raiz()>x) {
				this.HijoIzquierdo().Agregar(x);
			}
			else {
				this.HijoDerecho().Agregar(x);
			}
		}
	}
	public boolean EsHoja() {
		if (this.HijoDerecho()==null && this.HijoIzquierdo()==null) {
			return true;
			
		}
		else {return false;}
	}
	
	   private int mayor(Arbol arbol) {
	        if (arbol.HijoDerecho().EsVacio()) {
	            return arbol.Raiz();
	        } else {
	            return mayor(arbol.HijoDerecho());
	        }
	    }
	   private int menor(Arbol arbol) {
		   if (arbol.HijoIzquierdo()==null){
			   return arbol.Raiz();
		   }else {
			   return menor(arbol.HijoIzquierdo());
		   }
	   }
	   
	   public void Eliminar(int x) {
		   if(this.Raiz()==x && this.EsHoja()) {
			   this.Inicializar();
		   }
		   else {
			   	if(this.Raiz()==x &&this.HijoDerecho().EsHoja()) {
			   		int mayor=this.mayor(this.HijoIzquierdo());
			   		this.raiz.setInfo(mayor);
			   		Eliminar(mayor);
			   	}
			   	if(this.Raiz()==x) {
			   		int menor=this.menor(this.HijoDerecho());
			   		this.raiz.setInfo(menor);
			   		this.Eliminar(menor);
			   	}
			   	if(this.Raiz()>x) {
			   		this.HijoIzquierdo().Eliminar(x);
			   	}else {
			   		this.HijoDerecho().Eliminar(x);
			   	}
		   }
	   }
	   
	   
	   public void preOrder(Arbol a) {
	    	if (!a.EsVacio()){
	    		System.out.println(a.Raiz());
	    		preOrder(a.HijoIzquierdo());
	    		preOrder(a.HijoDerecho());
	    	}
	    }
	    
	    public void inOrder(Arbol a) {
	    	if (!a.EsVacio()){
	    		inOrder(a.HijoIzquierdo());
	    		System.out.println(a.Raiz());
	    		inOrder(a.HijoDerecho());
	    	}
	    }
	    
	    public void postOrder(Arbol a) {
	    	if (!a.EsVacio()){
	    		postOrder(a.HijoIzquierdo());
	    		postOrder(a.HijoDerecho());
	    		System.out.println(a.Raiz());
	    	}
	    }
	    
	    public void AgregarConjuntoAArbol(Conjunto a) {
	    	int numero = a.elegir();
	        if (this.EsVacio()) {
	            this.raiz = new NodoAB(numero);
	            a.sacar(numero);
	        } else {
	            if (numero < this.Raiz()) {
	                this.raiz.getHijoIzquierdo().Agregar(numero);
	            } else {
	                this.raiz.getHijoDerecho().Agregar(numero);
	            }
	        }
	    }
	    public void AgregarArbolAConjunto() {
	    	Conjunto a = new Conjunto();
	    	a.inicializar();
	    	if (!this.EsVacio()){
	    		a.agregar(this.raiz.getInfo());
	    		preOrder(this.HijoIzquierdo());
	    		preOrder(this.HijoDerecho());
	    	}
	    }
	    
	    public void preOrderAgregarHojas(Arbol arbol, Lista lista) {
	        if (!arbol.EsVacio()) {
	            if (arbol.EsHoja()) {
	                lista.add(arbol.Raiz());
	            }
	            preOrderAgregarHojas(arbol.HijoIzquierdo(), lista);
	            preOrderAgregarHojas(arbol.HijoDerecho(), lista);
	        }
	    }
	    public void preOrderAgregarMayores(int n,Arbol arbol, Lista lista) {
	        if (!arbol.EsVacio()) {
	            if (arbol.Raiz()>n) {
	                lista.add(arbol.Raiz());
	            }
	            preOrderAgregarHojas(arbol.HijoIzquierdo(), lista);
	            preOrderAgregarHojas(arbol.HijoDerecho(), lista);
	        }
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
	}
}
