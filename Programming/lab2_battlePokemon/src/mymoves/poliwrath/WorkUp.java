package mymoves.poliwrath;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = (new Effect()).stat(Stat.ATTACK, 1).stat(Stat.SPECIAL_ATTACK, 1);
    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
