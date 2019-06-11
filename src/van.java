
public class van extends veiculo {
	protected double combustivel1; // = Disel
	protected double rendimento1 = 10;
	protected int carga_max = 3500;
	protected int vel_med = 80;
	protected int carga;

	public double getRendimento_real1() { //sobreescrita do metodo
	       return this.rendimento1-(carga * 0.001);
	   }
}
