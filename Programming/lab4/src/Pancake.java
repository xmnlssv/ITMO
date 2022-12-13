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

    public void meal(String place) throws FoodNotCookedException{
        if (!prepared) {
            throw new FoodNotCookedException("Pancake " + getName() + " не приготовлен");
        }
        else {
            startEating();
            Random random = new Random();
            if (random.nextBoolean()) {
                sadness();
                prepared = false;
            } else {
                System.out.println("Pancake \"" + name + "\" начали есть на" + place);
                aftertaste();
            }
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

    public class PancakeDough {
        private int flavor = 10;
        private String nameOfModel = "Model1";
        private int dateOfPreparation;
        private boolean prepared;

        PancakeDough(int date_of_creation) {
            this.dateOfPreparation = dateOfPreparation;
            this.prepared = true;
        }
    }

    public static class Recipe{
        public static int getFlavor(int flavor) {return flavor;}
        public static String getNameOfModel(String nameOfModel) {return nameOfModel;}
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
