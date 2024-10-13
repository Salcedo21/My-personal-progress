public class Squirtle extends Pokemon implements IAgua{


    //Constructor//
    public Squirtle() {
    }

    //Sobreescritura de metodos abstractos//
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }
    //Implementaciones de la interfaz//
    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque Pistola Agua");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtle y este es mi ataque Hidro pulso");
    }
}
