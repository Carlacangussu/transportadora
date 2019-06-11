public class carro extends veiculo{

	protected double combustivel1; // = gasolina
	protected double combustivel2; // = alcool
	protected double rendimento1 = 14;
	protected double rendimento2 = 12;
	protected int carga_max = 360;
	protected int vel_med = 100;
	protected int carga;

	public double getRendimento_real1() { //sobreescrita do metodo
	       return this.rendimento1-(carga * 0.025);
	   }
		public double getRendimento_real2() { //sobreescrita do metodo
	        return this.rendimento2- (carga * 0.0231);
	    }
		
}
