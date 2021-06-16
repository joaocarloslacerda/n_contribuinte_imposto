package entities;

//como o método tax é abstrato, esta classe acaba sendo abstrata também
public abstract class TaxPlayer {
	
	//atributos da classe
	protected String name;
	protected Double currentIncome;
	
	//criando construtor padrão
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
	
	//setando um dado para o atributo name, conforme recebido por parâmetro
	public void setName(String name) {
		this.name = name;
	}
	
	//retornando o atributo currentIncome
	public Double getCurrentIncome() {
		return currentIncome;
	}
	
	//setando um dado para o atrubuto currentIncome, conforme recebido por parâmetro
	public void setCurrentIncome(Double currentIncome) {
		this.currentIncome = currentIncome;
	}
	
	//definindo método abstrato, ele terá uma implementação diferente em cada classe subclasse(PhysicalPerson e LegalPerson) através da sobreposição
	public abstract Double tax();
}
