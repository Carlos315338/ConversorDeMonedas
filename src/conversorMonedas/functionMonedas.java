package conversorMonedas;


public class functionMonedas {

	convertirMonedas monedas = new convertirMonedas();
	convertirMonedasApesos pesos = new convertirMonedasApesos();

	public void ConvertirMonedas(double Minput, String opcion) {

//Convertir de pesos a moneda

		switch (opcion) {
		case "De Pesos a Dólar":
			monedas.ConvertirPesosADolares(Minput);
			break;
		case "De Pesos a Euro":
			monedas.ConvertirPesosAEuros(Minput);
			break;
		case "De Pesos a Yen":
			monedas.ConvertirPesosAYen(Minput);
			break;
		case "De Pesos a Pesos Chilenos":
			monedas.ConvertirPesosAPesoChileno(Minput);
			break;
		case "De Pesos a Libras":
			monedas.ConvertirPesosALibras(Minput);
			break;

//Convertir de moneda a pesos

		case "De Dólar a Pesos":
			pesos.ConvertirDolaresAPesos(Minput);
			break;
		case "De Euro a Pesos":
			pesos.ConvertirEurosAPesos(Minput);
			break;
		case "De Yen a Pesos":
			pesos.ConvertirYenAPesos(Minput);
			break;
		case "De Peso Chileno a Pesos":
			pesos.ConvertirPesoChilenoAPesos(Minput);
			break;
		case "De Libra a Pesos":
			pesos.ConvertirLibraAPesos(Minput);
			break;


		}
	}

}
