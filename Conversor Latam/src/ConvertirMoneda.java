import javax.swing.*;

public class ConvertirMoneda {

	
	public void conversorPesoArgentinoADolar(double valorRecibido) {		
		double valorDolar = valorRecibido / 373.51;
		valorDolar = (double) Math.round(valorDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null,"Tienes $" +valorDolar+ " Dolares.");
	}
	
	public void conversorPesoArgentinoAEuro(double valorRecibido) {		
		double valorEuro = valorRecibido / 383.21;
		valorEuro = (double) Math.round(valorEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null,"Tienes $" +valorEuro+ " Dolares.");
	}
}
