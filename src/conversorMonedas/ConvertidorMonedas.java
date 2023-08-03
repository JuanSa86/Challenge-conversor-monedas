package conversorMonedas;

public class ConvertidorMonedas {

	private double peso = 1;
	private double dollar = 1/548.0;
	private double euro = 1/599.0;
	

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getDollar() {
		return dollar;
	}

	public double getEuro() {
		return euro;
	}

	public void setEuro(double euro) {
		this.euro = euro;
	}

	public void setDollar(double dollar) {
		this.dollar = dollar;
	}
	
	public double convertir(double input, double tipoMoneda, double cotizacion) {
		return (input  * cotizacion) / tipoMoneda;
	}
	
}
