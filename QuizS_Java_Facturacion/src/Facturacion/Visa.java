package Facturacion;

public class Visa extends Tarjeta{
    
    private double descuento;
    
    public Visa(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
        this.descuento=50000-(50000*0.18);
    }
    
    @Override
    public double cuotaDeManejo() {
        return descuento;
    }
}
