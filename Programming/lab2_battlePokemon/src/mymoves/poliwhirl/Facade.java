package mymoves.poliwhirl;

import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {
    public Facade(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        if (p.getCondition() == Status.BURN | p.getCondition() == Status.POISON | p.getCondition() == Status.PARALYZE) {
            Effect var2 = (new Effect()).stat(Stat.ATTACK, 2);
        }

    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}
