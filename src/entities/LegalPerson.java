package entities;

//subclasse LegalPerson herdando os dados e as funcionalidades da superclasse TaxPlayer
public class LegalPerson extends TaxPlayer{

	//atributo da classe
	private Integer numberOfEmployees;
	
	//criando construtor padrão com base na superclasse herdada
	public LegalPerson() {
		super();
	}
	
	//criando construtor personalizado com base nos atributos da superclasse herdada
	public LegalPerson(String name, Double currentIncome, Integer numberOfEmployees) {
		super(name, currentIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	//retornando o atributo numberOfEmployees
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	//setando um dado para o atributo numberOfEmployees conforme recebido por parâmetro
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	//sobrepondo o método tax instanciado na superclasse TaxPlayer
	@Override
	//calculando a taxa de imposto a ser paga por uma pessoa jurídica
	public Double tax() {
		//se a empresa(pessoa jurídica) tem mais de 10 funcionários, então ela paga uma taxa de 14% sobre a renda anual
		if(numberOfEmployees > 10) {
			return currentIncome * 0.14;
		}
		//se a empresa(pessoa jurídica) tem 10 ou menos funcionários, então ela paga uma taxa de 16% sobre a renda anual
		else {
			return currentIncome * 0.16;
		}
	}
}
