package General;

public abstract class Ataque {
	private int AD;
	public int getAD() {
		return AD;
	}
	public void setAD(int aD) {
		AD = aD;
	}
	public abstract void atacar();

}
