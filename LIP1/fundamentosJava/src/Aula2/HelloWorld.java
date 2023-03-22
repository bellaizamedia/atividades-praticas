package Aula2;

public class HelloWorld {

	public static void main(String[] args) {
		// main = é o nosso método principal, nesse método existe um padrão:
		
		// public = dizemos que ele é um método público;
		// static = precisamos falar que esse método pertence a classe, por isso, falamos que ele é um método estático;
		// void = esse método é não devolve nada, isto é, ele é executado e não retorna nenhum valor após sua execução;
		// String[] args = Por ser da especificação do método principal, dentro dos parênteses, temos que colocar o conteúdo String[] args (na verdade, pode ser outro nome além de args, porém esse é o padrão seguido pela maioria das pessoas.
		
		
		// MOSTRANDO UMA MENSAGEM NA TELA
		
		// Como fazer o Java imprimir uma mensagem?
		
		// System = queremos que o sistema imprima algo;
		
		// Imprimir o que? Uma mensagem = PRINT;
		
		// O LN inidca uma QUEBRA DE LINHA (% no terminal);
		
		// Essa ação de escrita é uma saída do sistema, ou seja, é um output - que é o nosso OUT;
		
		// Logo, queremos que o sistema (System) realize uma saída (a mensagem - print) do progama (out) que é imprimir algo na tela:
		
		System.out.println("Hello World");
		
		
		// RODANDO O CÓDIGO
		
		// O Java é uma linguagem híbrida, isto é, ela não é totalmente compilada;
		
		// Passos:
		
		// Escrever o código em Java;
		
		// Transformar este código em algo que a JVM consiga ENTENDER e EXECUTAR;
		
		// Nota: O código que roda na JVM é o bytecode java;
		
		// que é obtido após COMPILAR o código Java;
		
		// Para isso, podemos ir até o terminal e rodar o comando javac MeuPrimeiroPrograma.java (ex).
		
		// Importante atentar que o nome do arquivo é igual ao nome da classe
		
	}

}
