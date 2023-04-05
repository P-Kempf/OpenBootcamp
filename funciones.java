public class Main {
  
  public static void main(String[] args) {
    int resultado;
    resultado = suma(a:10, b:14, c:20);
    
    system.out.printlm(resultado);
    
    public static void main(String[] args) {
    Coche miCoche = new Coche();
    miCoche.anadirPuerta();
    System.out.println("Mi coche tiene " + miCoche.getNumeroPuertas() + " puertas.");
}

  }
  
  public static int suma (int a, int b, int c){
    return a + b + c;
  }
}

public class Coche {
  private int numeroPuertas;
  
  public Coche(){
    this.numeroPuertas = 0;
}

  public void añadirPuerta(){
    this.numeroPuertas++;
  }
