public class Pikachu extends Pokemon implements IElectrico{


    //Constructor//
    public Pikachu() {
    }

    //Sobreescritura de metodos abstractos//
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }
    //Implementaciones de la interfaz//
    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impactrueno");
    }

    @Override
    public void atacarPuniotrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Punio trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Pikachu y este es mi ataque  Rayo Carga");

    }
}
