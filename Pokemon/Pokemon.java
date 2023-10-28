package Pokemon_Abstraccionnn;

public abstract class Pokemon {
    private int ps;              // Puntos de Salud
    private int ataque;          // Ataque
    private int defensa;         // Defensa
    private int ataqueEspecial;  // Ataque Especial
    private int defensaEspecial; // Defensa Especial
    private int velocidad;       // Velocidad
    private int nivel;           // Nivel
    
     public Pokemon(int ps, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad, int nivel) {
        this.ps = ps;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.nivel = nivel;
     }
    public int getPs() {
        return ps;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // Métodos para modificar los atributos
    public void aumentarNivel(int cantidad) {
        nivel += cantidad;
    }
public void atacar(int m, Pokemon pokemon) {
    Movimiento movimiento = getMovimientos()[m];
    boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimiento, pokemon);
    if (seHaConcretadoAtaque) {
        movimiento.setPp(movimiento.getPp() - 1);
        movimiento.aplicarEfecto(pokemon); // Aplicar los efectos del movimiento
    }
    
}

   
    
    private void calculaDanio(int danio, double efectividad) {
        double puntosRestados = danio * efectividad;
        this.ps -= puntosRestados;
        System.out.printf("%s recibe %.2f puntos de daño\n", this.getNombre(), puntosRestados);
    }

    public void recibirAtaques(Movimiento movimiento, double efectividad) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        calculaDanio(movimiento.getPuntosDeAtaque(), efectividad);
    }

    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad = obtenerEfectividad(pokemon);

        if (movimiento.getPp() > 0) {
            pokemon.recibirAtaques(movimiento, efectividad);
            return true;
        } else {
            System.err.println("El movimiento no tiene puntos de PP");
            return false;
        }
    }

    public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento = getMovimientos()[m]; // Utiliza corchetes para acceder a un elemento específico del arreglo
        boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimiento, pokemon);
        if (seHaConcretadoAtaque) {
            movimiento.setPp(movimiento.getPp() - 1);
        }
    }

    public abstract double obtenerEfectividad(Pokemon pokemon);

    private Movimiento[] getMovimientos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public double calcularDanio(Movimiento movimiento, Pokemon oponente) {
        double nivelAtacante = this.getNivel();
        double nivelOponente = oponente.getNivel();
        double ataqueAtacante = this.getAtaque();
        double defensaOponente = oponente.getDefensa();
        double poderMovimiento = movimiento.getPuntosDeAtaque();
        double tipoMovimiento = movimiento.getTipo().getMultiplicador(this.getTipo());
        double efectividad = this.calcularEfectividad(movimiento);

        // Fórmula de daño simplificada
        double danio = ((2 * nivelAtacante / 5 + 2) * poderMovimiento * ataqueAtacante / defensaOponente / 50 + 2) * tipoMovimiento * efectividad;

        return danio;
    }

    private double calcularEfectividad(Movimiento movimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
