package General;

public class EstadoMorto extends Estado {

	public EstadoMorto(Personagem personagem) {
		super(personagem);
		personagem.setA(null);
		personagem.setC(null);
		personagem.setP(null);
		System.out.println("---FIM DE JOGO---");
		return;
		
	}

	@Override
	protected void setLimites() {
		this.setLimiteInferior(0);
		this.setLimiteSuperior(0);
		
	}

	@Override
	protected void verificarEstado() {
		// TODO Auto-generated method stub
		
	}
	
	public void batalha(int lifePerdida) {
		System.out.println("Personagem morto, não pode batalhar");
	}
	
	public void recompensa(int lifeGanha) {
		System.out.println("Personagem morto, não pode pegar recompensa");
	}
	
	@Override
	public String toString() {
		return "EstadoMorto ";
	}

}
