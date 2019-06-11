
public abstract class veiculo {
	protected double combustivel1;
	protected double combustivel2;
	protected double rendimento1;
	protected double rendimento2;
	protected int carga_max;
	protected int vel_med;
	
	public double getRendimento_real1() { //sobre escrever nas filhas
        return this.rendimento1- (carga_max * 0.3);
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
	public double getCoef_perda1() {
		return coef_perda1;
	}
	public void setCoef_perda1(double coef_perda1) {
		this.coef_perda1 = coef_perda1;
	}
	public double getCoef_perda2() {
		return coef_perda2;
	}
	public void setCoef_perda2(double coef_perda2) {
		this.coef_perda2 = coef_perda2;
	}
}
