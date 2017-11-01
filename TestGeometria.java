public class TestGeometria {
	
	public static void main (String args[]) {
		
		double lado = 5;
		double areaCuadrado = Geometria.areaCuadrado(lado);
		System.out.println("El area de un cuadrado de lado: " + lado + " es: " + areaCuadrado);
		
		double base = 3;
		double altura = 2;
		double areaTriangulo = Geometria.areaTriangulo(base,altura);
		System.out.println("El area de un triangulo de base: " + base + " y de altura: " + altura + " es: " + areaTriangulo);
		
		double lado1 = 6;
		double lado2 = 2;
		double areaRectangulo = Geometria.areaRectangulo( lado1, lado2 );
		System.out.println("El area de un rectangulo de base: " + lado1 + " y de altura: " + altura + " es: " + areaRectangulo);
		
		double radio = 4;
		double areaCirculo = Geometria.areaCirculo( radio );
		System.out.println("El area de un circulo de radio: " + radio + " es: "  +areaCirculo);
		
		
	}
}

