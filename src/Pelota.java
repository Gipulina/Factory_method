public class Pelota extends Producto{
    private Double radio;

    public Pelota(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }
    @Override
    public Double CalcularEspacio(){
        return ((4/3) * Math.PI * Math.pow(radio,3));
    }
}

