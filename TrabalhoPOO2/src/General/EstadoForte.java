package General;

public class EstadoForte extends Estado {

	@Override
	public String toString() {
		return "EstadoForte ";
	}

	public EstadoForte(Personagem personagem) {
		super(personagem);
		personagem.setA(new Forte());
		personagem.setC(new Rápido());
		setLimites();
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(70);
		this.setLimiteSuperior(100);
		
	}

	protected void verificarEstado() {
		if(this.getPersonagem().getLife() < 70 && this.getPersonagem().getLife() >= 30 ) {
			this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
		}
		if(this.getPersonagem().getLife() > 0 && this.getPersonagem().getLife() < 30 ) {
			this.getPersonagem().setEstado(new EstadoPerigo(this.getPersonagem()));
		}
		
		if(this.getPersonagem().getLife() == 0 ) {
			this.getPersonagem().setEstado(new EstadoMorto(this.getPersonagem()));
		}
		
	}

}
