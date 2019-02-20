package modelo;

public class Producto {
	
	private int num1;
	private int num2;
	
	public Producto() {
		num1 = 0;
		num2= 0;
	
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int calcularProducto(int num1, int num2) {
	
		return num1 * num2; 
}
	

}
