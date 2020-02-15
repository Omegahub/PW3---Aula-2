
public class ExemplosMetodosVoid {
	 public static void main(String[] args) {
		 saudacao(52);
		 dobro(4);
		 metade(24);
		 soma(2,8);
		 tamanho("gabriel");
	}

	 public static void saudacao(int periodo) {
		 if (periodo == 1) {
			System.out.println("bom dia !");
		}
		 
		 else if (periodo == 2) {
			 System.out.println("bom tarde !");
		 }
		 
		 else if (periodo == 3) {
			 System.out.println("bom noite !");
		 }
		 
		 else {
		 System.out.println("Olá"); 
		 }
		 
	 }
	 
	 public static void dobro(int valor) {
		 int resultado = valor * 2;
		 System.out.println("Resultado dobro : " + resultado);
		 
	 }
	 
	 public static void metade(int valor) {
		 int resultado = valor / 2;
		 System.out.println("Resultado metade : " + resultado);
	 }
	 
	 public static void tamanho(String nome) {
		 System.out.println("Tamanho : " + nome.length() );
		 
	 }
	 
	 public static void soma(int valor1, int valor2) {
		 int resultado =  valor1 + valor2;
		 System.out.println("Resultado soma : " + resultado);
		 
	 }
	 
	 
}
