import javax.swing.*;

public class Principal {	
	
	public static void main(String[] args) {
		
		Function moneda = new Function();
	
		String opciones = (JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moneda","Conversor de temperatura"},"Seleccion")).toString();
		switch (opciones) {
		case "Conversor de Moneda":
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
			double valorRecibido = Double.parseDouble(input);
			moneda.convertirMoneda(valorRecibido);
		
	}
	}
}
