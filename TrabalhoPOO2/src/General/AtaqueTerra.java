package General;

public class AtaqueTerra extends AtaqueDecorador {
	public AtaqueTerra(Ataque ataqueDecorado) {
		super(ataqueDecorado);
		setAD(2);
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

}
