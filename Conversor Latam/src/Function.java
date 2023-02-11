import javax.swing.JOptionPane;

public class Function {
	
	ConvertirMoneda moneda = new ConvertirMoneda();
	
	public void convertirMoneda(double valorRecibido) {
		String opciones = (JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Peso a Dolar","Peso a Euro"},"Seleccion")).toString();
		switch (opciones) {
		case "Peso a Dolar":
			moneda.conversorPesoArgentinoADolar(valorRecibido);
			break;
		case "Peso a Euro":
			moneda.conversorPesoArgentinoAEuro(valorRecibido);
			break;
		}
	}
}
