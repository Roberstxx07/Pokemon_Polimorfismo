import Pokemon_Abstraccionnn.PokemonDobleTipo;
import Pokemon_Abstraccionnn.PokemonUnicoTipo;
import Pokemon_Abstraccionnn.Tipo;

public class BatallaPokemon {
    public static void main(String[] args) {
        // Crea un Pokémon de un solo tipo (Ejemplo: Agua)
        PokemonUnicoTipo squirtle = new PokemonUnicoTipo("Squirtle", Tipo.AGUA, 10, 150);

        // Crea un Pokémon de dos tipos (Ejemplo: Fuego y Volador)
        PokemonDobleTipo charizard = new PokemonDobleTipo("Charizard", Tipo.FUEGO, Tipo.VOLADOR, 10, 160);

        // Accede a los atributos de los Pokémon
        System.out.println("Squirtle: Nombre: " + squirtle.getNombre() + " Tipo: " + squirtle.getTipo() + " Nivel: " + squirtle.getNivel() + " PS: " + squirtle.getPs());
        System.out.println("Charizard: Nombre: " + charizard.getNombre() + " Tipo1: " + charizard.getTipo1() + " Tipo2: " + charizard.getTipo2() + " Nivel: " + charizard.getNivel() + " PS: " + charizard.getPs());

        // Continúa con el resto de tu código de batalla o interacciones con estos Pokémon.
    }
}
