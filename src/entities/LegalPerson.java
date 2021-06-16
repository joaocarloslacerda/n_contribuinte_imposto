package entities;

//subclasse LegalPerson herdando os dados e as funcionalidades da superclasse TaxPlayer
public class LegalPerson extends TaxPlayer{

	//atributo da classe
	private Integer numberOfEmployees;
	
	//criando construtor padr�o com base na superclasse herdada
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
	
	//setando um dado para o atributo numberOfEmployees conforme recebido por par�metro
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	//sobrepondo o m�todo tax instanciado na superclasse TaxPlayer
	@Override
	//calculando a taxa de imposto a ser paga por uma pessoa jur�dica
	public Double tax() {
		//se a empresa(pessoa jur�dica) tem mais de 10 funcion�rios, ent�o ela paga uma taxa de 14% sobre a renda anual
		if(numberOfEmployees > 10) {
			return currentIncome * 0.14;
		}
		//se a empresa(pessoa jur�dica) tem 10 ou menos funcion�rios, ent�o ela paga uma taxa de 16% sobre a renda anual
		else {
			return currentIncome * 0.16;
		}
	}
}
