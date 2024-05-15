public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo(double novaBase,double novaAltura ) {
	    this.base = novaBase;
	    this.altura = novaAltura;
	   
    }
    
    public double getBase() {
    	return base;
    }
    
    public double getAltura() {
    	return base;
    }
    
    public void setBase( double novaBase) {
    	this.base = novaBase;
    }
    public void setAltura( double novaAltura) {
    	this.altura = novaAltura;
    }
    
    public int calcularArea() {
    	return (int) (base*altura);
    	
    }
    
    public int calcularPerimetro() {
    	return (int) (2 *(base+altura));
    	
    }
    
    public String toString () {
		  return "a altura do retangulo é " + this.altura + " e a sua base é " + this.base; 
	  }
    
}
