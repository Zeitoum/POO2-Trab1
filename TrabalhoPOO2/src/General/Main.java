package General;

public class Main extends Personagem {

	
	
	private static Personagem personagem;
    public static void main(String[] args) {
        personagem = new Personagem() {
        	public void setEstado(Estado estado) {
        		super.setEstado(estado);
        	}
        };
        Escudo escudo1 = new Escudo(10);
        Escudo escudo2 = new Escudo(15);
        escudo1.setSucessor(escudo2);
        Escudo escudo3 = new Escudo(20);
        escudo2.setSucessor(escudo3);
        
        System.out.println("Estado =" + personagem.getEstado());
        personagem.ganhaEscudo(escudo1);
        personagem.calculaDano(40);
        personagem.recompensa(20);
        System.out.println("Vida =" + personagem.getLife());
        System.out.println("Estado =" + personagem.getEstado());
        System.out.println("Ataque =" + personagem.getA());
        System.out.println("Ataque antes do poder adicionado : " + personagem.getA().getAD());
        personagem.setA(new AtaqueTerra(personagem.getA()));
        personagem.setA(new AtaqueGelo(personagem.getA()));
        personagem.setA(new AtaqueFogo(personagem.getA()));
        System.out.println("Ataque depois do poder adicionado : " + personagem.getA().getAD());
        
     
    }
}
