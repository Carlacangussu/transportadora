public class Viagem import Veiculo{
	private float distancia;
	private int carga;
	private int tempo;
	private Veiculo alocado;
	
	public Viagem() {
		super();
	}
	public Viagem(float distancia, int carga, int tempo) {
		this.distancia = distancia;
		this.carga = carga;
		this.tempo = tempo;
	}
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
