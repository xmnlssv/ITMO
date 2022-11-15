package mypocemons;

import mymoves.poliwrath.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwrath extends Pokemon {
    public Poliwrath(String name, int level) {
        super(name, level);

        super.setType(Type.WATER, Type.FIGHTING);
        super.setStats(90.0, 95.0, 95.0, 70.0, 90.0, 70.0);

        BubbleBeam bubbleBeam = new BubbleBeam(65.0, 100.0);
        Facade facade = new Facade(70.0, 100.0);
        WakeUpSlap wakeUpSlap = new WakeUpSlap(70.0, 100.0);
        WorkUp workUp = new WorkUp(0.0, 100.0);

        super.setMove(bubbleBeam, facade, wakeUpSlap, workUp);
    }
}
