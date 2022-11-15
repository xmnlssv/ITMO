package mypocemons;

import mymoves.poliwhirl.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Pokemon {
    public Poliwhirl(String name, int level) {
        super(name, level);

        super.setType(Type.WATER);
        super.setStats(65.0, 65.0, 65.0, 50.0, 50.0, 90.0);

        BubbleBeam bubbleBeam = new BubbleBeam(65.0, 100.0);
        Facade facade = new Facade(70.0, 100.0);
        WakeUpSlap wakeUpSlap = new WakeUpSlap(70.0, 100.0);

        super.setMove(bubbleBeam, facade, wakeUpSlap);
    }
}
