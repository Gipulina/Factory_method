public class Caja extends Producto{

    private Double ancho;
    private Double largo;
    private Double altura;

    public Caja(Double ancho, Double largo, Double altura) {
        this.ancho = ancho;
        this.largo = largo;
        this.altura = altura;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public Double CalcularEspacio(){
        return (ancho*largo*altura);
    }

}
