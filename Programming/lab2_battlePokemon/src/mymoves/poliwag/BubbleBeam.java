package mymoves.poliwag;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove {
    public BubbleBeam(double pow, double acc) {
        super(Type.WATER, pow, acc);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        if (Program.chance(0.1)) {
            Effect var2 = (new Effect()).stat(Stat.SPEED, -1);
        }

    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
