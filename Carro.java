package model;


public class Carro {
   private String fabricante;
   private String modelo;
   private int ano;
   private boolean motorLigado;
   private int velocidade;

   //Constructor simple
   public Carro() {
	super();
	
}

 //Constructor complete
   
public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
	super();
	this.fabricante = fabricante;
	this.modelo = modelo;
	this.ano = ano;
	this.motorLigado = motorLigado;
	this.velocidade = velocidade;
}


//Getters and setters

public String getFabricante() {
	return fabricante;
}

public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}

public boolean isMotorLigado() {
	return motorLigado;
}

public void setMotorLigado(boolean motorLigado) {
	this.motorLigado = motorLigado;
}

public int getVelocidade() {
	return velocidade;
}

public void setVelocidade(int velocidade) {
	this.velocidade = velocidade;
}


  public void detalhes() {
	  System.out.println("-----CARRO-----");
	  System.out.println("Fabricante: " + fabricante);
	  System.out.println("Modelo: " + modelo);
	  System.out.println("Ano: " + ano);
  }
   
public String situacaoMotor() {
	
	if(motorLigado){
		return this.modelo + " --> MOTOR LIGADO";
		
	}
	else {
		return this.modelo + " --> MOTOR DESLIGADO";
	}
}
   
   public String ligarMotor() {
	   if(motorLigado){
			return this.modelo + " já estava com o motor ligado.";	
		}
	   else {
		this.motorLigado = true;
		   
		   return this.modelo + " teve seu motor ligado agora";
	   }
   }
   
   public String desligarMotor() {
	   if(!this.motorLigado) {
		   return this.modelo + " já está com o motor desligado.";
	   }
	   
	   else if(this.velocidade == 0) {
		   this.motorLigado = false;
		   return this.modelo + " foi desligado(a) agora";
	   }
	   
	   else {
		   return "o motor do(a)" + this.modelo + "não pôde ser desligado, carro em movimento!";
	   }
   }
   
   public String acelerar(int velocidade) {
	  if(this.motorLigado) {
		  this.velocidade = (this.velocidade + velocidade);
		  return this.modelo + " acelerou, VRUM VRUM! \n" + "Velocidade atual do carro: " + this.velocidade + " Km/h";
	  }
	  else {
		  
		  return "ATENÇÃO!!! Não é possível acelerar com o motor desligado, seu animal.";
	  }
	  
	   
	   
	   
   }
   
   public String frear(int velocidade) {
	   if (!motorLigado) {
		return "ATENÇÃO! O motor do(a) " + this.modelo + " está desligado! O carro já está parado!" ;
	}
	   
	   else if(this.velocidade > 0 ){
			   this.velocidade = (this.velocidade - velocidade);
			   if(this.velocidade <= 0) {
				  this.velocidade = 0;
				   return "FREOU!!! O carro agora está parado!";   
			   }
			   return "FREOU!!! Velocidade atual: " + this.velocidade + " Km/h" ;
		   }
	   else {
		   return "Atenção!!! O carro já está parado!";
	  
	  
		   
	   }
	   
		  
	   
	   
	   
	   
	   
	   
	   
	   
   }
   



}
