package mymoves.tyrogue;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class MachPunch extends PhysicalMove {
    public MachPunch(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length - 1];
    }
}