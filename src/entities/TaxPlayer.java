package entities;

//como o m�todo tax � abstrato, esta classe acaba sendo abstrata tamb�m
public abstract class TaxPlayer {
	
	//atributos da classe
	protected String name;
	protected Double currentIncome;
	
	//criando construtor padr�o
	public TaxPlayer() {
	}
	
	//criando construtor personalizado com base nos atributos da classe
	public TaxPlayer(String name, Double currentIncome) {
		this.name = name;
		this.currentIncome = currentIncome;
	}
	
	//retornando o atributo name
	public String getName() {
		return name;
	}
	
	//setando um dado para o atributo name, conforme recebido por par�metro
	public void setName(String name) {
		this.name = name;
	}
	
	//retornando o atributo currentIncome
	public Double getCurrentIncome() {
		return currentIncome;
	}
	
	//setando um dado para o atrubuto currentIncome, conforme recebido por par�metro
	public void setCurrentIncome(Double currentIncome) {
		this.currentIncome = currentIncome;
	}
	
	//definindo m�todo abstrato, ele ter� uma implementa��o diferente em cada classe subclasse(PhysicalPerson e LegalPerson) atrav�s da sobreposi��o
	public abstract Double tax();
}
