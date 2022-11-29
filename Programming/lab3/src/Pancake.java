import java.util.Objects;
import java.util.Random;

public class Pancake implements IFood {
    private String name;
    private Staffing staffing;
    private boolean prepared;
    Pancake(String name, Staffing staffing) {
        this.name = name;
        this.staffing = staffing;
        prepared = true;
    }

    public String getName() {
        return name;
    }
    public Staffing getStaffing() {
        return staffing;
    }

    public boolean getPrepared() {
        return prepared;
    }

    public void meal(String place) {
        if (prepared) {
            startEating();
            Random random = new Random();
            if (random.nextBoolean()) {
                sadness();
                prepared = false;
            }
            else {
                System.out.println("Pancake \"" + name + "\" начали есть на" + place);
                aftertaste();
            }
        }
        else {
            System.out.println("Pancake \"" + name + "\" пока что не приготавлен, следовательно съесть его на данный момент невозможно");
        }
    }

    public void sadness() {
        System.out.println("Pancake \"" + name + "\" упал на пол");
    }
    public void aftertaste() {
        System.out.println("Pancake \"" + name + "\" успешно съеден");
    }
    public void startEating() {
        System.out.println("Pancake \"" + name + "\" начали есть");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pancake pancake = (Pancake) o;
        return pancake.getName().equals(getName())
                && pancake.getPrepared() == getPrepared()
                && pancake.getStaffing() == getStaffing();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStaffing(), getPrepared());
    }
    @Override
    public String toString() {
        return "Pancake{" +
                "name='" + getName() + '\''+
                ", staffing=" + getStaffing() +
                ", isPrepared=" + getPrepared() +"}";
    }
}
