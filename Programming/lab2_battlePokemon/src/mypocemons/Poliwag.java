package mypocemons;

import mymoves.poliwag.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);

        super.setStats(30.0, 50.0, 40.0, 40.0, 40.0, 90.0);
        BubbleBeam bubbleBeam = new BubbleBeam(65.0, 100.0);
        Facade facade = new Facade(70.0, 100.0);

        super.setMove(bubbleBeam, facade);
    }
}
