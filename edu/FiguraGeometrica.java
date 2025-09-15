package edu;

public abstract class FiguraGeometrica implements CalculosGeometricos {
	
	private String cor;
	private int id;
	private static int totalFiguras = 0;
	
	public FiguraGeometrica(String cor) {
		
		this.cor = cor;
		this.id = ++totalFiguras;
		
	}
	
	public String getCor() {
		
		return cor;
		
	}
	
	public void setCor(String cor) {
		
		this.cor = cor;
		
	}
	
	// Criei este método por necessidade. Não estava sendo exigido no enunciado
	
	public int getId() {	
		
		return id;
		
	}
	
	public static int getTotalFiguras() {
		
		return totalFiguras;
		
	}
	
	// Este método está sendo substituído pelo mesmo método nas subclasses
	
	public String getInfo() {
		
		return "ID: " + getId() + ", Cor: " + getCor() + ", Tipo: " + getTipoFigura();
		
	}
 	
	public abstract String getDetalhes();
	
}