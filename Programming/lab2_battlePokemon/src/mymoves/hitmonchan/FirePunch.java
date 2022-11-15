package mymoves.hitmonchan;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public class FirePunch extends PhysicalMove {
    public FirePunch(double pow, double acc) {
        super(Type.FIRE, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Program.chance(0.1)) {
            Effect.burn(p);
        }

    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
