public class Geometria {
	
	public static double areaCuadrado(double lado){
	
		double area = lado * lado;
		
		return area;
		
	}
	
	public static double areaTriangulo(double base,double altura){
	
		double area = base * altura;
		
		return area;
		
	}
	
	public static double areaRectangulo( double lado1, double lado2 ){
	
		double area = lado1 * lado2;
		
		return area;
		
	}
	
	static final double pi = 3.1416;
	
	public static double areaCirculo(double radio){
		
		
		double area = pi * (radio * radio);
		
		return area;
		
	}
	
	
}

