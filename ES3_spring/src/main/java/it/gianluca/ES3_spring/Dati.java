package it.gianluca.ES3_spring;

public class Dati {

	private String num1;
	private String num2;
	
	@Override
	public String toString() {
		return num1 + " + " + num2 + "="+ (Integer.parseInt(num1)+Integer.parseInt(num2));
	}
	
	public String getNum1() {
		return num1;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
}
