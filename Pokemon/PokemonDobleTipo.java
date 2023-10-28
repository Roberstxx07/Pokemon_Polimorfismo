package Pokemon_Abstraccionnn;


public class PokemonDobleTipo {
    private String nombre;
    private final Tipo tipo1;
    private Tipo tipo2;
    private int nivel;
    private int ps;

    public PokemonDobleTipo(String nombre, Tipo tipo1, Tipo tipo2, int nivel, int ps) {
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.nivel = nivel;
        this.ps = ps;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo1() {
        return tipo1;
    }

    public Tipo getTipo2() {
        return tipo2;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPs() {
        return ps;
    }

    // Agrega otros atributos y métodos según sea necesario
}
