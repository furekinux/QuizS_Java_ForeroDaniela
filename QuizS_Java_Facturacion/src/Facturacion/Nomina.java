package Facturacion;

public class Nomina extends Tarjeta {
    
    private double descuento;

    public Nomina(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
        this.descuento=50000-(50000*0.15);
    }
    
    @Override
    public double cuotaDeManejo() {
        return descuento;
    }
    
}
