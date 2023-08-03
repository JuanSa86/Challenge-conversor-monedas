package principal;

import java.lang.invoke.SwitchPoint;

import javax.swing.JOptionPane;

import conversorMonedas.ConvertidorMonedas;


public class Principal {
	
	public static void main(String[] args) {
		while (true) {
			Object[] conversores = {"monedas", "temperatura"};
			String seleccion = (String)JOptionPane.showInputDialog(null, "Que conversor desea utilizar?", "MENU CONVERSOR", JOptionPane.PLAIN_MESSAGE, null, conversores, conversores[0]);
			
			ConvertidorMonedas input = new ConvertidorMonedas();
			
			double myInput;
			double cotizacion = 0;
			double tipoMoneda = 0;
			String nombreMonedaInicial = "";
			String nombreMonedaFinal = "";
			
			switch (seleccion) {
			case "temperatura":
				JOptionPane.showMessageDialog(null, "aca deberia ejecutarse el conversor de temperatura");
				break;
			
			
			case "monedas":
				// Selecon moneda inicial
				Object[] options = {"Pesos Argentinos",
                "Dollars", "Euros"};
				int monedaInicial = JOptionPane.showOptionDialog(null,
					"¿Que moneda te gustaria convertir?",
					"SELECCIONA LA MONEDA",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,     //do not use a custom Icon
					options,  //the titles of buttons
					options[0]); //default button title
				
				switch (monedaInicial) {
				case 0:
					JOptionPane.showMessageDialog(null, "selecionaste pesos argentinos");
					tipoMoneda = input.getPeso();
					nombreMonedaInicial = " pesos argentinos ";
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "selecionaste dolares");
					tipoMoneda = input.getDollar();
					nombreMonedaInicial = " dolares ";
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "selecionaste euros");
					tipoMoneda = input.getEuro();
					nombreMonedaInicial = " euros ";
					break;
				default:
					break;
				}
			}
			
			myInput = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la cantidad que desea convertir"));
			
			// Seleccion moneda final
			Object[] options = {"Pesos Argentinos", "Dollars", "Euros"};
			int monedaFinal = JOptionPane.showOptionDialog(null,
					"¿A qué moneda te gustaria convertir?",
					"SELECCIONA LA MONEDA",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,     //do not use a custom Icon
					options,  //the titles of buttons
					options[1]); //default button title
							
			switch (monedaFinal) {
					case 0:
						JOptionPane.showMessageDialog(null, "selecionaste pesos argentinos");
						cotizacion = input.getPeso();
						nombreMonedaFinal = " pesos argentinos ";
						break;
					case 1:
						JOptionPane.showMessageDialog(null, "selecionaste dolares");
						cotizacion = input.getDollar();	
						nombreMonedaFinal = "dolares";
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "selecionaste euros");
						cotizacion = input.getEuro();	
						nombreMonedaFinal = "euros";
						break;
					default:
						break;
			}
			double result = Math.round(input.convertir(myInput, tipoMoneda, cotizacion));
			JOptionPane.showMessageDialog(null, myInput + " " + nombreMonedaInicial + " equivalen a: " + result + " " + nombreMonedaFinal);
			
			
			
			int deseaSalir = JOptionPane.showOptionDialog ( null, "desea salir del conversor", "MENU CONVERSOR", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object [ ] { "SI", "NO" }, null );
			if (deseaSalir == 0) {
				JOptionPane.showMessageDialog(null, "see you soon");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "come on again!");
			}
		}
	}
	

}		
		/* 
		//Muestre un cuadro de diálogo de error que muestra el mensaje 'alertar':
		JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
		//Muestre un cuadro de diálogo de información interna con el mensaje 'información':
		JOptionPane.showInternalMessageDialog ( frame, "información", "información", JOptionPane.INFORMATION_MESSAGE );
			 
		//Muestre un panel de información con las opciones sí / no y envíe un mensaje 'elija uno':
		JOptionPane.showConfirmDialog ( null,
			             "elija uno", "elija uno", JOptionPane.YES_NO_OPTION );
			 
		//Mostrar un cuadro de diálogo de información interna con las opciones sí / no / cancelar y mensaje 'por favor elija uno' e información del título:
		JOptionPane.showInternalConfirmDialog ( frame,
			             "por favor elija uno", "información",
			             JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE );
			 
		//Muestre un cuadro de diálogo de advertencia con las opciones OK, CANCELAR, título 'Advertencia' y mensaje 'Haga clic en Aceptar para continuar':
		Object [ ] opciones = { "OK", "CANCEL" };
		JOptionPane.showOptionDialog ( null, "Haga clic en Aceptar para continuar", "Advertencia",
			             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
			             null, opciones, opciones [ 0 ] );
			 
		//Show a dialog asking the user to type in a String:
			String inputValue = JOptionPane.showInputDialog("Please input a value");
			//Show a dialog asking the user to select a String:
			 Object[] possibleValues = { "First", "Second", "Third" };

			 Object selectedValue = JOptionPane.showInputDialog(null,
			             "Choose one", "Input",
			             JOptionPane.INFORMATION_MESSAGE, null,
			             possibleValues, possibleValues[0]);
			
			// Use:
			//To create and use an JOptionPane directly, the standard pattern is roughly as follows:
			     JOptionPane pane = new JOptionPane(arguments);
			     pane.set.Xxxx(...); // Configure
			     JDialog dialog = pane.createDialog(parentComponent, title);
			     dialog.show();
			     Object selectedValue = pane.getValue();
			     if(selectedValue == null)
			       return CLOSED_OPTION;
			     //If there is not an array of option buttons:
			     if(options == null) {
			       if(selectedValue instanceof Integer)
			          return ((Integer)selectedValue).intValue();
			       return CLOSED_OPTION;
			     }
			     //If there is an array of option buttons:
			     for(int counter = 0, maxCounter = options.length;
			        counter < maxCounter; counter++) {
			        if(options[counter].equals(selectedValue))
			        return counter;
			     }
			     return CLOSED_OPTION;
		*/
	
	

