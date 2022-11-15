package mymoves.poliwrath;

import ru.ifmo.se.pokemon.*;
public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (p.getCondition() == Status.SLEEP) {
            Effect var2 = (new Effect()).stat(Stat.ATTACK, 2);
        }

    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
