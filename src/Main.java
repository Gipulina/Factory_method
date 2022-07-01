public class Main {

    public static void main(String[] args) {
        try {
            Producto prod1 = Almacen.calcularEspacioNecesario("CAJA10X10");
            prod1.CalcularEspacio();
            Producto prod2 = Almacen.calcularEspacioNecesario("PELOTAFUTBOL");
            prod2.CalcularEspacio();
            Producto prod3 = Almacen.calcularEspacioNecesario("PELOTATENIS");
            prod3.CalcularEspacio();
        }
        catch (Exception e){
            System.out.println("!Hay un error!" + e );
        }
    }

}
