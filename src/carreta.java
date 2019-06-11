
public class carreta extends veiculo {
	protected double combustivel1; // = Disel
	protected double rendimento1 = 8;
	protected int carga_max = 30000;
	protected int vel_med = 60;
	protected int carga;

	public double getRendimento_real1() { //sobreescrita do metodo
	       return this.rendimento1-(carga * 0.0002);
	   }
}
