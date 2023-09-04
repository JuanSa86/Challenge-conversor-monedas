package conversorTemperaturas;

import javax.swing.JOptionPane;

import conversorMonedas.PrincipalMonedas;
import principal.Principal;

public class PrincipalTemperaturas {
	
	Double myInput;
	Double myOuput;
	String unidadInput;
    String unidadOuput;

	public void realizarConversor() {
		ConvertidorTemperaturas input = new ConvertidorTemperaturas();
			Object[] conversores = {"Kelvin -> Celcius", "Kelvin -> Fahrenheit",
					"Celcius -> Kelvin", "Celcius -> Fahrenheit",
					"Fahrenheit -> Celcius", "Fahrenheit -> Kelvin"};
			String seleccion = (String)JOptionPane.showInputDialog(null, "Que conversor desea utilizar?", "MENU CONVERSOR", JOptionPane.PLAIN_MESSAGE, null, conversores, conversores[0]);
			
			if (seleccion == null) {
                JOptionPane.showMessageDialog(null, "Hasta luego");
                System.exit(0);
            }
			
			switch (seleccion) {
			case "Kelvin -> Celcius":
				obtenerUnidades(seleccion);
				myInput = Principal.obtenerInput();
				myOuput = input.kelviaACelcius(myInput);
				break;
			
			case "Kelvin -> Fahrenheit":
				obtenerUnidades(seleccion);
				myInput = Principal.obtenerInput();
				myOuput = input.kelviaAFahreheit(myInput);
				break;
			
			case "Celcius -> Kelvin":
				obtenerUnidades(seleccion);
				myInput = Principal.obtenerInput();
				myOuput = input.celciusAKelvin(myInput);
				break;
				
			case "Celcius -> Fahrenheit":
				obtenerUnidades(seleccion);
				myInput = Principal.obtenerInput();
				myOuput = input.celciusAFahrenheit(myInput);
				break;
				
			case "Fahrenheit -> Kelvin":
				obtenerUnidades(seleccion);
				myInput = Principal.obtenerInput();
				myOuput = input.fahrenheitAkelvin(myInput);
				break;
				
			case "Fahrenheit -> Celcius":
				obtenerUnidades(seleccion);
				myInput = Principal.obtenerInput();
				myOuput = input.fahrenheitACelcius(myInput);
				break;
			}
			
			if (myInput!= null) {
				JOptionPane.showMessageDialog(null,
						myInput + "º " + unidadInput + " equivalen a: " + myOuput + "º " + unidadOuput);
			}
			System.out.println(myInput);
				
		// Resultado
			
			

			
		}
	
	 public void obtenerUnidades(String cadena) {
	        String[] palabras = cadena.split(" -> ");
	        unidadInput = palabras[0];
	        unidadOuput = palabras[1];
	 }
		
}
	
	