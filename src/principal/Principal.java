package principal;

import javax.swing.JOptionPane;

import conversorMonedas.PrincipalMonedas;
import conversorTemperaturas.PrincipalTemperaturas;


public class Principal {
	
	public static void main(String[] args) {
		while (true) {
			Object[] conversores = {"monedas", "temperatura"};
			String seleccion = (String)JOptionPane.showInputDialog(null, "Que conversor desea utilizar?", "MENU CONVERSOR", JOptionPane.PLAIN_MESSAGE, null, conversores, conversores[0]);
			
			if (seleccion == null) {
                JOptionPane.showMessageDialog(null, "Hasta luego");
                break;
            }
			
			switch (seleccion) {
			case "temperatura":
				PrincipalTemperaturas conversionTemp = new PrincipalTemperaturas();
				conversionTemp.realizarConversor();
				break;
			
			case "monedas":
				PrincipalMonedas conversionMon = new PrincipalMonedas();
				conversionMon.realizarConversor();
				break;
			}
			int deseaSalir = JOptionPane.showOptionDialog ( null, "desea salir del conversor", "MENU CONVERSOR", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object [ ] { "SI", "NO" }, null );
			if (deseaSalir == 0) {
				JOptionPane.showMessageDialog(null, "Hasta pronto!");
				break;
			}
		}
	
	}
	
	public static double obtenerInput() {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir");
                if (input == null) {
                	return 0;
                }

                if (input.matches("-?\\d+(\\.\\d+)?")) {
                    return Double.parseDouble(input);
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número válido.");
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número válido.");
            }
        }
    }
}		


