package mypocemons;

import mymoves.hitmonchan.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hitmonchan extends Pokemon {
    public Hitmonchan(String name, int level) {
        super(name, level);

        super.setType(Type.FIGHTING);
        super.setStats(50.0, 105.0, 79.0, 35.0, 110.0, 76.0);

        MachPunch machPunch = new MachPunch(80.0, 85.0);
        RockSlide rockSlide = new RockSlide(75.0, 90.0);
        BulkUp bulkUp = new BulkUp(0.0, 100.0);
        new FirePunch(75.0, 100.0);

        super.setMove(machPunch, rockSlide, bulkUp);
    }
}
