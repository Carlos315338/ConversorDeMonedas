package conversorMonedas;

import javax.swing.JOptionPane;

public class convertirMonedasApesos {

	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor / 4559.25;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos Colombianos");
	}

	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor / 4957.70;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Colombianos");
	}

	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor / 34.19;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Colombianos");
	}

	public void ConvertirPesoChilenoAPesos(double valor) {
		double monedaPesoChileno = valor / 5.56;
		monedaPesoChileno = (double) Math.round(monedaPesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesoChileno + " Pesos Colombianos");

	}

	public void ConvertirLibraAPesos(double valor) {
		double monedaLibra = valor / 5652.83;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Colombianos");
	}

	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor / 3.45;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos Colombianos");

	}
}
