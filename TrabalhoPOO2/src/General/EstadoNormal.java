package General;

public class EstadoNormal extends Estado {

	public EstadoNormal(Personagem personagem) {
		super(personagem);
		personagem.setA(new Amedio());
		personagem.setC(new Normal());
		
	}

	protected void setLimites() {
		this.setLimiteInferior(30);
		this.setLimiteSuperior(69);
		
	}

	protected void verificarEstado() {
		if(this.getPersonagem().getLife() <= 0 ) {
			this.getPersonagem().setEstado(new EstadoMorto(this.getPersonagem()));
		}
		
		if(this.getPersonagem().getLife() < this.getLimiteInferior() && this.getPersonagem().getLife() > 0) {
			this.getPersonagem().setEstado(new EstadoPerigo(this.getPersonagem()));
		}
		else if(this.getPersonagem().getLife() > this.getLimiteSuperior()) {
			this.getPersonagem().setEstado(new EstadoForte(this.getPersonagem()));
		}
		
	}
	
	@Override
	public String toString() {
		return "EstadoNormal ";
	}

}
