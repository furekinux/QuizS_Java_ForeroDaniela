package Facturacion;

public class Main {

    public static void main(String[] args) {
        Tarjeta tarjeta1 = new Joven("666 666 666",99.99,"Marzo");
        Tarjeta tarjeta2 = new Visa("123 456 789",100.99,"Marzo");
        Tarjeta tarjeta3 = new Nomina("987 654 321",100.99,"Marzo");
        
        Cartera carteraMarzo = new Cartera("Marzo");
        
        carteraMarzo.agregarTarjeta(tarjeta1);
        carteraMarzo.agregarTarjeta(tarjeta2);
        carteraMarzo.agregarTarjeta(tarjeta3);
        
        carteraMarzo.imprimirListaDeTarjetas();
    }
    
}