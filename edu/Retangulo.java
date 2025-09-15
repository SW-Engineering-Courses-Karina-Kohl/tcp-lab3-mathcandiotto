package edu;

public class Retangulo extends FiguraGeometrica {
	
	private double largura;
	private double altura;
	
	public Retangulo(String cor, double largura, double altura) {
		
		super(cor);
		this.largura = largura;
		this.altura = altura;
		
	}
	
	public double getLargura() {
		
		return largura;
		
	}
	
	public void setLargura(double largura) {
		
		this.largura = largura;
		
	}
	
	public double getAltura() {
		
		return altura;
		
	}
	
	public void setAltura(double altura) {
		
		this.altura = altura;
		
	}
	
	@Override
	public double calcularArea() {
		
		return (largura * altura);
		
	}
	
	@Override
	public double calcularPerimetro() {
		
		return (2 * (largura + altura));
		
	}
	
	@Override
	public String getTipoFigura() {
		
		return "Retângulo";
		
	}
	
	@Override
	public String getDetalhes() {
		
		return "Largura: " + getLargura() + ", Altura: " + getAltura();
		
	}
	
	// Criei este método por necessidade. Não estava sendo exigido no enunciado
	// A formatação está diferente em relação ao enunciado (casas depois da vírgula) e o atributo "cor" não está repetido
	
	@Override
	public String getInfo() {
		
		return "ID: " + getId() + ", Cor: " + getCor() + ", Tipo: " + getTipoFigura() + ", " + getDetalhes() + ", Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro();
		
	}

}