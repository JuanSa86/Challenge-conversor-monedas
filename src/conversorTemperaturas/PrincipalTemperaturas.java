package conversorTemperaturas;

import javax.swing.JOptionPane;

import conversorMonedas.PrincipalMonedas;
import principal.Principal;

public class PrincipalTemperaturas {
	
	double myInput;
	double myOuput;
	String unidadInput;
    String unidadOuput;

	public void realizarConversor() {
		ConvertidorTemperaturas input = new ConvertidorTemperaturas();

		// Seleción moneda inicial
		while (true) {
			Object[] conversores = {"Kelvin -> Celcius", "Kelvin -> Fahrenheit",
					"Celcius -> Kelvin", "Celcius -> Fahrenheit",
					"Fahrenheit -> Celcius", "Fahrenheit -> Kelvin"};
			String seleccion = (String)JOptionPane.showInputDialog(null, "Que conversor desea utilizar?", "MENU CONVERSOR", JOptionPane.PLAIN_MESSAGE, null, conversores, conversores[0]);
			
			if (seleccion == null) {
                JOptionPane.showMessageDialog(null, "Hasta luego");
                break;
            }
			
			switch (seleccion) {
			case "Kelvin -> Celcius":
				obtenerUnidades(seleccion);
				myInput = Principal.obtenerInput();
				myOuput = input.kelviaACelcius(myInput);
				break;
			
			case "monedas":
				break;
			}
			
			int deseaSalir = JOptionPane.showOptionDialog ( null, "desea salir del conversor", "MENU CONVERSOR", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object [ ] { "SI", "NO" }, null );
			if (deseaSalir == 0) {
				JOptionPane.showMessageDialog(null, "Hasta pronto!");
				break;
			}
		}
	
			
		// Resultado
			JOptionPane.showMessageDialog(null,
					myInput + "º " + unidadInput + " equivalen a: " + myOuput + "º " + unidadOuput);
		}
	
	 public void obtenerUnidades(String cadena) {
	        String[] palabras = cadena.split(" -> ");
	        unidadInput = palabras[0];
	        unidadOuput = palabras[1];
	 }
		
}
	
	