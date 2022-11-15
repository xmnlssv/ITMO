package Main;

import mypocemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program{
    public static void main (String[] args){
        Battle b = new Battle();

        Mewtwo yhwach = new Mewtwo("Yhwach", 1);
        Tyrogue aizen = new Tyrogue("Aizen", 1);
        Hitmonchan icigo = new Hitmonchan("Ichigo", 1);
        Poliwrath ichibei = new Poliwrath("Ichibei", 1);
        Poliwhirl soulKing = new Poliwhirl("Soul King", 1);
        Poliwag hitsugaya = new Poliwag("Hitsugaya", 1);

        b.addAlly(yhwach);
        b.addAlly(hitsugaya);
        b.addAlly(ichibei);

        b.addFoe(aizen);
        b.addFoe(soulKing);
        b.addFoe(icigo);

        b.go();
    }

    public static boolean chance(double d) {
        return d > Math.random();
    }
}
