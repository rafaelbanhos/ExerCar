
public class Carro extends Veiculo {
	
	//private Motor motor;
	private boolean ligado;
	Motor motor1 = new Motor();
	MotorTurbo motorturbo = new MotorTurbo();
	
	public boolean ligar() {		
		if (this.ligado) {
			this.ligado = false;			
			System.out.println("Painel desligado.");
			motor1.ligarMotor();
			motorturbo.ligarTurbo();
		} else {
			this.ligado = true;			
			System.out.println("Painel ligado.");
			motor1.ligarMotor();
			motorturbo.ligarTurbo();
		}
		return this.ligado;		
	}	
			
}
