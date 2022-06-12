package General;

public class Escudo extends Handler {
	
	private int escudo;

	public Escudo(int escudo) {
		super();
		this.escudo = escudo;
	}

	

	@Override
	public void processaDano(int valor, Personagem personagem) {
		int resto = valor - escudo;
		System.out.println("Quantidade de vida poupada = " + escudo);
		
		if(resto <= 0) {
			System.out.println("Escudo protegeu com sucesso o personagem, zerando o dano que iria tomar ");
			return;
		}
		
		if(resto >= 1  && getSucessor()!= null) {
			getSucessor().processaDano(resto,personagem);
		}
		
		else
        {
            personagem.setLife(personagem.getLife()- resto);
            if(personagem.getLife() < 0) {
    			personagem.setLife(0);
    		}
            return;
        }
		
	}
	
	
}

	

