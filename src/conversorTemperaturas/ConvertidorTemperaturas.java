package conversorTemperaturas;

public class ConvertidorTemperaturas {

		private double kelvin;
		private double fahrenheit;
		private double celcius;


		public double kelviaACelcius(double k) {
			this.celcius =  k - 273.15;
			return celcius;
		}

		public double kelviaAFahreheit(double k) {
			this.fahrenheit =  (k - 273.15) * (9/5) + 32;
			return fahrenheit;
		}
		
		public double celciusAKelvin(double c) {
			this.kelvin =  c + 273.15;
			return kelvin;
		}
		
		public double celciusAFahrenheit(double c) {
			this.fahrenheit =  (c * 9/5) + 32;
			return fahrenheit;
		}
		
		public double fahrenheitACelcius(double f) {
			this.fahrenheit =  (f - 32) * (9/5);
			return fahrenheit;
		}
		
		public double fahrenheitAkelvin(double f) {
			this.fahrenheit =  (f - 32) * (9/5) + 273.15;
			return fahrenheit;
		}
}
