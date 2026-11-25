package controller;

import model.Carro;

public class CadastroCarros {

	public static void main(String[] args) {
		
      Carro audiR8 = new Carro();
      audiR8.setFabricante("Audi");
      audiR8.setModelo("Audi R8");
      audiR8.setAno(2006);
      audiR8.setMotorLigado(false);
      audiR8.setVelocidade(0);
      
      Carro bmwI8 = new Carro("BMW", "Bmw I8", 2015, false, 0);
      
      audiR8.detalhes();
      audiR8.situacaoMotor();
      audiR8.ligarMotor();
      audiR8.desligarMotor();
      
      
      bmwI8.situacaoMotor();
      bmwI8.ligarMotor();
      bmwI8.desligarMotor();
      
      
      
    //Exibição
	
	System.out.println(audiR8.situacaoMotor());
	System.out.println(audiR8.ligarMotor());
	System.out.println(audiR8.situacaoMotor());
	System.out.println(audiR8.desligarMotor());
	System.out.println(audiR8.situacaoMotor());
	System.out.println(audiR8.ligarMotor());
	System.out.println(audiR8.situacaoMotor());
	
	System.out.println(audiR8.acelerar(150));
	System.out.println(audiR8.frear(160));
	
	
	}
	
	

    
}


