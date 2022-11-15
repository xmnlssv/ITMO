package mypocemons;

import mymoves.tyrogue.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrogue extends Pokemon {
    public Tyrogue(String name, int level) {
        super(name, level);

        super.setType(Type.FIGHTING);
        super.setStats(35.0, 35.0, 35.0, 35.0, 35.0, 35.0);

        MachPunch machPunch = new MachPunch(80.0, 85.0);
        RockSlide rockSlide = new RockSlide(75.0, 90.0);
        BulkUp bulkUp = new BulkUp(0.0, 100.0);

        super.setMove(machPunch, rockSlide, bulkUp);
    }
}
