package Pokemon_Abstraccionnn;


public class PokemonUnicoTipo {
    private String nombre;
    private Tipo tipo;
    private int nivel;
    private int ps;

    public PokemonUnicoTipo(String nombre, Tipo tipo, int nivel, int ps) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ps = ps;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPs() {
        return ps;
    }

    // Agrega otros atributos y métodos según sea necesario
}
