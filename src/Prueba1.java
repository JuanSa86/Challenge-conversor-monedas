import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Prueba1 {
    public int realizarConversor(Object[] options, Component parentComponent, String title, Object arguments) {
        JOptionPane pane = new JOptionPane(arguments);
       // pane.set.Xxxx(...); // Configuración (se completará más adelante)
        JDialog dialog = pane.createDialog(parentComponent, title);
        dialog.show();
        Object selectedValue = pane.getValue();
        
        if (selectedValue == null)
            return JOptionPane.CLOSED_OPTION;

        // Si no hay un arreglo de botones de opción:
        if (options == null) {
            if (selectedValue instanceof Integer)
                return ((Integer) selectedValue).intValue();
            return JOptionPane.CLOSED_OPTION;
        }

        // Si hay un arreglo de botones de opción:
        for (int counter = 0, maxCounter = options.length; counter < maxCounter; counter++) {
            if (options[counter].equals(selectedValue))
                return counter;
        }
        return JOptionPane.CLOSED_OPTION;
    }
    
    public static void main(String[] args) {
    	JFrame frame = new JFrame("Conversor de Temperaturas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		JRadioButton moneda = new JRadioButton("MONEDAS");
		JRadioButton temperatura = new JRadioButton("TEMPERATURAS");
		
		
		JLabel tipoConvertidorLabel = new JLabel("Convertidor de ");
		ButtonGroup tipoConvertidor = new ButtonGroup();
		
	
		
		JButton seleccionConversorButton = new JButton("SELECCIONAR");
		seleccionConversorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder message = new StringBuilder("Selected options:\n");
				if (moneda.isSelected()) {
					message.append("aca se va a pasar de  kelvin a fahrenheit");
				}
				if (temperatura.isSelected()) {
					message.append("Radio: Celcius\n");
					Prueba1 conversor = new Prueba1();
			        Object[] options = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
			        Component parentComponent = frame; // Debe proporcionar un componente padre válido
			        String title = "Conversión de Temperaturas";
			        Object arguments = null; // Debe proporcionar argumentos apropiados para el diálogo
			        
			        int result = conversor.realizarConversor(options, parentComponent, title, arguments);
			        System.out.println("Opción seleccionada: " + result);
			        
			        
				}
				
				System.out.println(message);
			}
		});
		tipoConvertidor.add(temperatura);
		tipoConvertidor.add(moneda);
		frame.add(tipoConvertidorLabel);
		frame.add(moneda);
		frame.add(temperatura);
		frame.add(seleccionConversorButton);
		frame.pack();
		
		frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        
		frame.setVisible(true);
        // Ejemplo de uso
    }      
}