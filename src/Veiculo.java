
public abstract class Veiculo {
	private double combustivel1;
	private double combustivel2;
	private double rendimento1;
	private double rendimento2;
	private int carga_max;
	private int vel_med;

	public Veiculo() {
		super();
	}

	
	public double getRendimento_real1() { //sobre escrever nas filhas
      return this.rendimento1 = rendimento1;
    }
	public double getRendimento_real2() { //sobre escrever nas filhas
       return this.rendimento2- (carga_max * 0.4);
    }
	public double getCombustivel1() {
		return combustivel1;
	}
	public void setCombustivel1(double combustivel1) {
		this.combustivel1 = combustivel1;
	}
	public double getCombustivel2() {
		return combustivel2;
	}
	public void setCombustivel2(double combustivel2) {
		this.combustivel2 = combustivel2;
	}
	public double getRendimento1() {
		return rendimento1;
	}
	public void setRendimento1(double rendimento1) {
		this.rendimento1 = rendimento1;
	}
	public double getRendimento2() {
		return rendimento2;
	}
	public void setRendimento2(double rendimento2) {
		this.rendimento2 = rendimento2;
	}
	public int getCarga_max() {
		return carga_max;
	}
	public void setCarga_max(int carga_max) {
		this.carga_max = carga_max;
	}
	public int getVel_med() {
		return vel_med;
	}
	public void setVel_med(int vel_med) {
		this.vel_med = vel_med;
	}
}
