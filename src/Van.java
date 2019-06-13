double alcool = 3.49;
double gasolina = 4.449;
double diesel = 3.869;

public class van extends veiculo {
	private int carga;

public Van(double combustivel1, double rendimento1, int carga_max, int vel_med, int carga) {
		this.combustivel1 = disel;
		this.rendimento1 = 10;
		this.carga_max = 3500;
		this.vel_med = 80;
		this.carga = carga;
	}

	public double getRendimento_real1() { //sobreescrita do metodo
	       return this.rendimento1-(carga * 0.001);
	   }
}
