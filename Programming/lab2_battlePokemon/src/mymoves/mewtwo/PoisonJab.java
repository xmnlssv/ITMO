package mymoves.mewtwo;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.*;
import Main.Program;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(double pow, double acc) {
        super(Type.POISON, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Program.chance(0.3)) {
            Effect.poison(p);
        }

    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
