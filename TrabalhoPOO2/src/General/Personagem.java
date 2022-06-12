package General;

public abstract class Personagem {
	public Personagem() {
		super();
		this.life = 70;
		estado = new EstadoNormal(this);
	}
	
	private Escudo escudo;
	
	public void calculaDano(int lifePerdida) {
			escudo.processaDano(lifePerdida, this);
	}
	
	public void ganhaEscudo(Escudo valorEscudo) {
		this.escudo = valorEscudo;
	}
	
	
	public void processaDano(int lifePerdida) {
		System.out.println("Vida inicial = " +this.getLife());
		this.setLife(this.getLife() - lifePerdida);
		System.out.println("Vida final = " +(this.getLife()));
		System.out.println("Estado = " +this.estado.getClass().getName());
	}
	
	public void recompensa(int lifeGanha) {
		System.out.println("Vida inicial = " +this.getLife());
		this.setLife(this.getLife() + lifeGanha);
		if(this.getLife()> 100) {
			this.setLife(100);
		}
		System.out.println("Vida final = " +(this.getLife()));
		System.out.println("Estado = " +this.estado.getClass().getName());
	}

	private Ataque a;
	private Correr c;
	private Pular p;
	private Estado estado;
	private int life;
	
	public Ataque getA() {
		return a;
	}
	public void setA(Ataque a) {
		this.a = a;
	}
	public Correr getC() {
		return c;
	}
	public void setC(Correr c) {
		this.c = c;
	}
	public Pular getP() {
		return p;
	}
	public void setP(Pular p) {
		this.p = p;
	}
	
	public void Atacar() {
		a.atacar();
	}
	
	public void Pular() {
		p.pular();
	}
	
	public void Correr() {
		c.correr();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
		this.estado.verificarEstado();
	}
	
	
	
	
}
