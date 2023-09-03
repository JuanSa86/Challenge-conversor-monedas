package conversorMonedas;

import javax.swing.JOptionPane;
import principal.Principal;

public class PrincipalMonedas {

	public void realizarConversor() {
		double myInput = 0;
		double cotizacion = 0;
		double tipoMoneda = 0;
		String nombreMonedaInicial = "";
		String nombreMonedaFinal = "";
		ConvertidorMonedas input = new ConvertidorMonedas();

		// Seleción moneda inicial
		Object[] options = { "Pesos Argentinos", "Dollars", "Euros" };
		int monedaInicial = JOptionPane.showOptionDialog(null, "¿Que moneda te gustaria convertir?",
				"SELECCIONA LA MONEDA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
				options[0]);

		switch (monedaInicial) {
		case 0:
			tipoMoneda = input.getPeso();
			nombreMonedaInicial = " pesos argentinos ";
			break;
		case 1:
			tipoMoneda = input.getDollar();
			nombreMonedaInicial = " dolares ";
			break;
		case 2:
			tipoMoneda = input.getEuro();
			nombreMonedaInicial = " euros ";
			break;
		default:
			break;
		}

		String mensajeInput = "Moneda de origen: " + nombreMonedaInicial;
		if (nombreMonedaInicial != "") {
			myInput = Principal.obtenerInput();
		}

		// Seleccion moneda final
		String mensajeOuput = mensajeInput + "\nCantidad ingresada" + myInput;
		Object[] options2 = { "Pesos Argentinos", "Dollars", "Euros" };
		int monedaFinal = 0;
		if (myInput != 0) {
			monedaFinal = JOptionPane.showOptionDialog(null, (mensajeOuput + "\n¿A qué moneda te gustaria convertir?"),
					"SELECCIONA LA MONEDA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2,
					options2[1]);
		}

		switch (monedaFinal) {
		case 0:
			cotizacion = input.getPeso();
			nombreMonedaFinal = "pesos argentinos";
			break;
		case 1:
			cotizacion = input.getDollar();
			nombreMonedaFinal = "dolares";
			break;
		case 2:
			cotizacion = input.getEuro();
			nombreMonedaFinal = "euros";
			break;
		default:
			break;
		}
		
		if (myInput == 0 || nombreMonedaFinal == "") {
			System.out.println("hasta pronto");
		} else {
			double result = Math.round(input.convertir(myInput, tipoMoneda, cotizacion));
			JOptionPane.showMessageDialog(null,
					myInput + " " + nombreMonedaInicial + " equivalen a: " + result + " " + nombreMonedaFinal);
		}
		
	}
	
	
}