package mymoves.hitmonchan;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(double pow, double acc) {
        super(Type.ROCK, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Program.chance(0.3)) {
            Effect.flinch(p);
        }

    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
