
public class ExemploMetodosComRetorno {
	public static void main(String[] args) {
		int resultado = cubo(3);
		System.out.println("Resultado cubo : " + resultado);
		
		String resulNome = concatenar("gabriel","amorim");
		System.out.println("nome : " + resulNome);
		
		int resulSinal = sinal(-10);
		System.out.println("Resultado sinal : " + resulSinal);
		
		boolean resuldia = ehDiaSemana("segunda");
		System.out.println("dia : " + resuldia);
		
		boolean possoIr = irBanco("terca", 10);
		System.out.println("posso ir : " + possoIr);
		
	}
	
	public static int cubo(int num){
		return num * num * num;
	}
	
	public static String concatenar(String v1, String v2) {
		return v1 + " " + v2;
	}
	
	public static int sinal(int num) {
		if(num > 0)
		{
			return 1;
		}
		else if(num < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public static boolean ehDiaSemana(String dia) {
		if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo"))
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public static boolean irBanco(String dia, int hora) {
		boolean diaSemana = ehDiaSemana(dia);
		if(diaSemana == false)
		{
			return false;
		}
		if(hora >= 10 && hora <= 16)
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
	

}
