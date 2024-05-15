public class Circulo {
	private double raio;
	
	    
	    public Circulo(double novoRaio ) {
		    this.raio = novoRaio;  
	    }
	    
	    public double getRaio() {
	    	return raio;
	    }
	   
	    
	    public void setRaio( double novoRaio) {
	    	this.raio = novoRaio;
	    }
	   
	    public double calcularArea() {
	    	return (double) (3.14*(raio*raio));
	    	
	    }
	    
	    public double calcularPerimetro() {
	    	return (double) ((3.14*3.14) * raio);
	    	
	    }
	    
	    public String toString () {
			  return "O raio do circulo é " + this.raio; 
		  }
	    
	}
	
