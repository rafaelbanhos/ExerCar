
public class Motor {
	
	private int id;
	private int forca;
	private boolean ligado;
	
	public boolean ligarMotor() {
		if (this.ligado) {
			this.ligado = false;
			System.out.println("Motor desligado.");
		} else {
			this.ligado = true;
			System.out.println("Motor ligado.");
		}
		return this.ligado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	

}
