
public class MotorTurbo {
	
	private int cilindrada;
	private int forca;
	private boolean motorLigado;
	private boolean turboLigado;
	
	public boolean ligarTurbo() {
		if (this.motorLigado) {
			this.motorLigado = false;
			System.out.println("Turbo desativado.");
		} else {
			this.motorLigado = true;
			System.out.println("Turbo ativado.");
		}		
		return this.turboLigado;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public boolean isTurboLigado() {
		return turboLigado;
	}

	public void setTurboLigado(boolean turboLigado) {
		this.turboLigado = turboLigado;
	}
	
	

}
