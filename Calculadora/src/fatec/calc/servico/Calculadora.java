package fatec.calc.servico;

public class Calculadora {

	public int somar(String parcelas)
	{
		int resultado = 0;
		String[] vetorDeNumeros = parcelas.split(",");
		for (String numero : vetorDeNumeros) {
			if (!numero.trim().isEmpty()) {
				resultado += Integer.parseInt(numero);
			}
		}
		return resultado;
	}
	
}
