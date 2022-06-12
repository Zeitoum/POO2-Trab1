package General;

public class AtaqueGelo extends AtaqueDecorador {
	public AtaqueGelo(Ataque ataqueDecorado) {
		super(ataqueDecorado);
		setAD(3);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

}
