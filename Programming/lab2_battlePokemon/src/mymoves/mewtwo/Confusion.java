package mymoves.mewtwo;

import ru.ifmo.se.pokemon.*;
import Main.Program;

public class Confusion extends SpecialMove {
    public Confusion(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Program.chance(0.1)) {
            Effect.confuse(p);
        }

    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
