package General;

public abstract class Handler {

	private Handler sucessor;
	
	public void setSucessor(Handler sucessor){
		this.sucessor = sucessor;
	}
	
	public Handler getSucessor() {
		return this.sucessor;
	}
	
	public abstract void processaDano(int valor, Personagem personagem);


	
}
