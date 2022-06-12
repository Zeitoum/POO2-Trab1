package General;

public class EstadoPerigo extends Estado {

	public EstadoPerigo(Personagem personagem) {
		super(personagem);
		personagem.setA(new Fraco());
		personagem.setC(new Devagar());
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(1);
		this.setLimiteSuperior(29);
		
	}

	@Override
	protected void verificarEstado() {
		if(this.getPersonagem().getLife() == 0 ) {
			this.getPersonagem().setEstado(new EstadoMorto(this.getPersonagem()));
		}
		
		else if(this.getPersonagem().getLife() > this.getLimiteSuperior() && this.getPersonagem().getLife() > 70) {
			this.getPersonagem().setEstado(new EstadoForte(this.getPersonagem()));
		}
		
		else if(this.getPersonagem().getLife() > this.getLimiteSuperior() && this.getPersonagem().getLife() <= 70 )
			this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
	}
	
	@Override
	public String toString() {
		return "EstadoPerigo ";
	}

}
