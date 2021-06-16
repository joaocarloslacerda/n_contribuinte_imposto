package entities;

//subclasse PhysicalPerson herdando os dados e as funcionalidades da superclasse TaxPlayer
public class PhysicalPerson extends TaxPlayer{
	
	//atributo da classe
	private Double healthExpenses = 0.0;
	
	//criando construtor padr�o com base no atributo da classe PhysicalPerson e na classe herdada
	public PhysicalPerson() {
		super();
	}
	
	//criando construtor personalizado com base no atributo da classe PhysicalPerson e nos atributos da classe herdada
	public PhysicalPerson(String name, Double currentIncome, Double healthExpenses) {
		super(name, currentIncome);
		this.healthExpenses = healthExpenses;
	}
	
	//retornando o atributo healthExpenses
	public Double getHealthExpenses() {
		return healthExpenses;
	}
	
	//setando um dado para o atributo healthExpenses conforme recebido por par�metro
	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	//sobrepondo o m�todo tax instanciado na superclasse que foi herdada
	@Override
	//calculando a taxa de imposto a ser paga por uma pessoa f�sica
	public Double tax() {
		//criando atributo auxiliar
		double aux = 0.0;
		//se a renda anual tiver sido menor que 20000.00 ent�o a taxa do imposto a ser paga ser� 15% sobre a renda
		if(currentIncome < 20000.00) {
			aux = currentIncome * 0.15;
		}
		//se a renda anual tiver sido maior ou igual a 20000.00 ent�o a taxa do imposto a ser paga ser� de 25% sobre a renda
		else if(currentIncome >= 20000.00) {
			aux = currentIncome * 0.25;
		}
		//se a pessoa teve gastos com saude, 50% deste valor � subtra�do do valor da taxa de imposto calculada
		if(healthExpenses > 0.0) {
			return aux - (healthExpenses * 0.50);
		}
		//se a pessoa f�sica n�o teve gastos com sa�de, apenas � retornado o valor da taxa de imposto
		else {
			return aux;
		}	
	}
}
