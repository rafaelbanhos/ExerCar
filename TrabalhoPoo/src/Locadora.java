
public class Locadora {
	public static void main(String[] args) {
		
		//Ligando e desligando um carro
		
		Carro c1 = new Carro();
		
		c1.setId(123);
		c1.setCor("Azul");
		c1.setMarca("Fiat");
		c1.setModelo("Uno");
		
		Motor m1 = new Motor();
		m1.setId(3200);
		m1.setForca(90);
		
		MotorTurbo mturbo1 = new MotorTurbo();
		mturbo1.setCilindrada(2000);
		mturbo1.setForca(250);
		
				
		c1.ligar();		
		//motor1.ligarMotor();
		//motorTB1.ligarTurbo();
		
		System.out.println();		
				
		System.out.println("ID do Carro: " + c1.getId() + "\nCor do carro: " + c1.getCor() + "\nMarca do carro: " + c1.getMarca() + "\nModelo do carro: " + c1.getModelo());
		System.out.println("ID do motor: " + m1.getId() + "\nForça do motor(Cv): " + m1.getForca());
		System.out.println("Força do motor turbo(Cv): " + mturbo1.getForca() + "\nCilindrada do motor turbo: " + mturbo1.getCilindrada());
		
		System.out.println();
		
		c1.ligar();
		//motor1.ligarMotor();
		//motorTB1.ligarTurbo();			
		
		System.out.println("Finalizando...");
		
				
	}

}
