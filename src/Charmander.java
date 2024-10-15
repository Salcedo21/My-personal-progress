public class Charmander extends Pokemon implements IFuego{

    //Constructor//
    public Charmander() {
    }

    //Sobreescritura de metodos abstractos//
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }
    //Implementaciones de la interfaz//
    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque PunioFuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y este es mi ataque Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque Ascuas");
    }
}
