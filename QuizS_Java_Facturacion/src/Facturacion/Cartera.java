package Facturacion;

import java.util.ArrayList;
import java.util.List;

public class Cartera implements PatronCartera{
    private String anho;
    private List<Tarjeta> Tarjetas;

    public Cartera(String anho) {
        this.anho = anho;
        this.Tarjetas = new ArrayList<>();
    }
    
    public Cartera(String anho, List<Tarjeta> Tarjetas) {
        this.anho = anho;
        this.Tarjetas = Tarjetas;
    }
    
    @Override
    public void imprimirListaDeTarjetas() {
        for(int i=0; i < Tarjetas.size();i++){
            int counter=i+1;
            System.out.println("Tarjeta Nº "+counter);
            System.out.println("Numero de tarjeta: "+Tarjetas.get(i).getNumeroDeCuenta()+
                    "\nCuota de Manejo: "+Tarjetas.get(i).cuotaDeManejo()+
                    "\nTipo de tarjeta: "+Tarjetas.get(i).getClass().getSimpleName()+
                    "\nMes: "+Tarjetas.get(i).getMes()+"\n"
            );
        }
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        Tarjetas.add(t);
    }

    public String getAnho() {
        return anho;
    }

    public List<Tarjeta> getTarjetas() {
        return Tarjetas;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public void setTarjetas(List<Tarjeta> Tarjetas) {
        this.Tarjetas = Tarjetas;
    }
    
}
