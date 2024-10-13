public class Bulbasaur extends Pokemon implements IPlanta{

    //Constructor//

    public Bulbasaur() {
    }

    //Sobreescritura de metodos abstractos//
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque aranazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco");
    }

    //Implementaciones de la interfaz//
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Paralizar");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Latigo Cepa");
    }
}
