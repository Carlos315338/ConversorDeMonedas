package conversorTemperaturas;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	convertirTemperatura temperatura = new convertirTemperatura();

	public void ConvertirTemperatura(double Minput, String opcion) {

		switch (opcion) {
		case "Kelvin a Grados Celcius":
			temperatura.ConvertirKelvinACelcius(Minput);
			break;
		case "Kelvin a Grados Farenheit":
			temperatura.ConvertirKelvinAFarenheit(Minput);
			break;
		case "Grados Celcius a Grados Farenheit":
			temperatura.ConvertirCelciusAFarenheit(Minput);
			break;
		case "Grados Celcius a Kelvin":
			temperatura.ConvertirCelciusAKelvin(Minput);
			break;
		case "Grados Farenheit a Grados Celcius":
			temperatura.ConvertirFarenheitACelcius(Minput);
			break;
		}
	}
}
