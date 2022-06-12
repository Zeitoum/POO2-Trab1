package General;

public abstract class Estado {
	private Personagem personagem;
	private double limiteInferior;
	private double limiteSuperior;
	
public Estado(Personagem personagem) {
	this.personagem=personagem;
	setLimites();
}
protected abstract void setLimites();

protected abstract void verificarEstado();

public void batalha(int lifePerdida) {
	this.personagem.setLife(this.personagem.getLife() - lifePerdida);
	this.verificarEstado();
}

public void recompensa(int lifeGanha) {
	this.personagem.setLife(this.personagem.getLife() + lifeGanha);
	this.verificarEstado();
}
public Personagem getPersonagem() {
	return personagem;
}
public void setPersonagem(Personagem personagem) {
	this.personagem = personagem;
}
public double getLimiteInferior() {
	return limiteInferior;
}
public void setLimiteInferior(double limiteInferior) {
	this.limiteInferior = limiteInferior;
}
public double getLimiteSuperior() {
	return limiteSuperior;
}
public void setLimiteSuperior(double limiteSuperior) {
	this.limiteSuperior = limiteSuperior;
}

}
