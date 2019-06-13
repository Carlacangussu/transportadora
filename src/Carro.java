double alcool = 3.49;
double gasolina = 4.449;
double diesel = 3.869;

public class Carro extends Veiculo{

	private int carga;

public Carro(double combustivel1, double combustivel2, double rendimento1, double rendimento2, int carga_max, int vel_med, int carga) {
		this.combustivel1 = gasolina;
		this.combustivel2 = alcool;
		this.rendimento1 = 14;
		this.rendimento2 = 12;
		this.carga_max = 360;
		this.vel_med = 100;
		this.carga = carga;		
	}
	public double getRendimento_real1() { //sobreescrita do metodo
	       return this.rendimento1-(carga * 0.025);
	   }
		public double getRendimento_real2() { //sobreescrita do metodo
	        return this.rendimento2- (carga * 0.0231);
	    }
		
}
