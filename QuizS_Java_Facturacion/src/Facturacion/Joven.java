package Facturacion;

public class Joven extends Tarjeta{
    
    private double descuento;
    
    public Joven(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
        descuento=50000-(50000*0.11);
    }

    @Override
    public double cuotaDeManejo() {
        return descuento;
    }
    
}
