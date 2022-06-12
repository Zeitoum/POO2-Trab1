package General;

public abstract class AtaqueDecorador extends Ataque {
	private Ataque ataqueDecorado;
	
	public AtaqueDecorador(Ataque ataqueDecorado) {
		this.ataqueDecorado = ataqueDecorado;
	}
	
	public int getAD() {
		return ataqueDecorado.getAD() + super.getAD();
	}
}