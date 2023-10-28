package Pokemon_Abstraccionnn;

public class Movimiento {
    private String nombre;
    private int puntosDeAtaque;
    private int pp;
    private Tipo tipo;
    private ClaseMovimiento clase;

public Movimiento(String nombre, int puntosDeAtaque, Tipo tipo, int pp) {
        this.nombre = nombre;
        this.puntosDeAtaque = puntosDeAtaque;
        this.pp = pp;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public int getPp() {
        return pp;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

private Movimiento movimientos[];

public void setMovimiento(int indice, Movimiento movimiento) {
    movimientos[indice] = movimiento;
}

public Movimiento getMovimiento(int indice) {
    return movimientos[indice];
}
public void aplicarEfecto(Pokemon pokemonAtacado) {
    if (this.clase == ClaseMovimiento.FISICO) {
        // Realizar efectos físicos en el Pokémon atacado (puede disminuir la Defensa, etc.).
    } else if (this.clase == ClaseMovimiento.ESPECIAL) {
        // Realizar efectos especiales en el Pokémon atacado (puede disminuir la Defensa Especial, etc.).
    } else if (this.clase == ClaseMovimiento.ESTADO) {
        // Realizar efectos de estado en el Pokémon atacado (puede envenenar, paralizar, etc.).
    }
}

}
