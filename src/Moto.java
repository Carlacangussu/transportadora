double alcool = 3.49;
double gasolina = 4.449;
double diesel = 3.869;

public class Moto extends Veiculo{

	private int carga;

public Moto(double combustivel1, double combustivel2 = alcool, double rendimento1, double rendimento2, int carga_max, int vel_med, int carga) {
		this.combustivel1 = gasolina;
		this.combustivel2 = alcool;
		this.rendimento1 = 50;
		this.rendimento2 = 43;
		this.carga_max = 50;
		this.vel_med = 110;
		this.carga = carga;
	}

	public double getRendimento_real1() { //sobre escrita do metodo
	       return this.rendimento1-(carga *0.3);
	   }
		public double getRendimento_real2() { //sobreescrita do metodo
	        return this.rendimento2- (carga* 0.4);
	    }
}
