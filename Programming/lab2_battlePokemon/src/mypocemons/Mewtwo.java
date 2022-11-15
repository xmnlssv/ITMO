package mypocemons;

import mymoves.mewtwo.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mewtwo extends Pokemon {
    public Mewtwo(String name, int level) {
        super(name, level);

        super.setType(Type.PSYCHIC);
        super.setStats(106, 110, 90, 154, 90.0, 130);

        PoisonJab poisonJab = new PoisonJab(80, 100);
        EnergyBall energyBall = new EnergyBall(90, 100);
        Flamethrower flamethrower = new Flamethrower(90, 100);
        Confusion confusion = new Confusion(50, 100);

        super.setMove(poisonJab, energyBall, flamethrower, confusion);
    }
}
