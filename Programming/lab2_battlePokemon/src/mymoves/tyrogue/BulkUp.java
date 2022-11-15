package mymoves.tyrogue;

import ru.ifmo.se.pokemon.*;
import Main.Program;

public class BulkUp extends StatusMove {
    public BulkUp(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        if (Program.chance(0.3)) {
            Effect var2 = (new Effect()).stat(Stat.ATTACK, 1).stat(Stat.DEFENSE, 1);
        }

    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
