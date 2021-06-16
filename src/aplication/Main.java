package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.TaxPlayer;

public class Main {

	public static void main(String[] args) {
		
		//alterando a linguagem automatica do compilador para a desejada
		Locale.setDefault(Locale.US);
		//criando objeto do tipo Scanner que irá realizar a leitura padrão do teclado
		Scanner sc = new Scanner(System.in);
		
		//cria uma lista do tipo TaxPlayer recebendo um new ArrayList
		List<TaxPlayer> list = new ArrayList<>();
		
		//solicita a informação de quantos contribuintes terão os dados lidos
		System.out.println("Enter the number of tax payers: ");
		//armazena a quantidade de contribuintes no atributo numberTaxPlayer
		int numberTaxPlayer = sc.nextInt();
		
		//laço for para que ocorra um loop conforme a quantidade de contribuintes que foi informado
		for(int i=1; i<=numberTaxPlayer; i++) {
			System.out.println("\nTax payer #" + i + " data: ");
			//solicitando que informe se é pessoa física ou jurídica
			System.out.println("Individual or company (i/c)? ");
			//armazenando no atributo op o caracter que foi digitado pelo usuário
			char op = sc.next().charAt(0);
			//limpando o buffer
			sc.nextLine();
			//solicita a informação do nome do contribuinte
			System.out.println("Name: ");
			//armazena o nome do contribuinte no atributo name
			String name = sc.nextLine();
			//solicita a informação de quanto é a renda anual do contribuinte
			System.out.println("Anual income: ");
			//armazenando o valor da renda anual do contribuinte no atributo currentIncome
			double currentIncome = sc.nextDouble();
			
			//verifica se foi informado que o contribuinte é pessoa física ou jurídica
			if(op == 'i') {
				//solicita o valor dos gatos com saúde que o contribuinte teve durante o ano
				System.out.println("Health expenditures: ");
				//armazena no atributo healthExpenses o valor dos gastos com saúde
				double healthExpenses = sc.nextDouble();
				//adiciona na lista um new PhysicalPerson chamando o construtor da classe passando os dados do contribuinte como parâmetro
				list.add(new PhysicalPerson(name, currentIncome, healthExpenses));
			}
			else if(op == 'c') {
				//solicita que o contribuinte informe quantos funcionários possui
				System.out.println("Number of employees: ");
				//armazena no atributo numberEmployees o número de funcionários
				int numberEmployees = sc.nextInt();
				//adiciona na lista um new LegalPerson chamando o construtor da classe passando os dados do contribuinte como parâmetro
				list.add(new LegalPerson(name, currentIncome, numberEmployees));
			}
		}
			
			//instanciando e inicializando atributo que irá armazenar a soma da arrecadação de imposto
			double totalTax = 0;
			//percorre cada posição na lista
			System.out.println("\nTAXES PAID: ");
			for(TaxPlayer x : list) {
				//printando ome do contribuinte e a taxa de imposto a ser paga pelo contribuinte
				System.out.println(x.getName() + ": $" + String.format("%.2f", x.tax()));
				
				//somando a taxa de imposto a ser paga por cada contribuinte
				totalTax += x.tax();
			}
			//printando a arrecação total de imposto
			System.out.println("\nTOTAL TAXES: $" + String.format("%.2f", totalTax));
		
	//encerrando o objeto do tipo scanner que permite a entrada de dados padrão do teclado
	sc.close();
	}
}
