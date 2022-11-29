import java.util.Objects;

public class Person extends AHuman{
    Person() {
        super();
    }
    Person(String name) {
        super(name);
    }
    Person(String name, Status status) {
        super(name, status);
    }

    public void pancakeReport(Pancake pancake) {
        System.out.println(name + " рассказывает про pancake :\"" + pancake.getName() + "\"");
        System.out.println("Pancake с начинкой " + pancake.getStaffing().getName());
        if(pancake.getPrepared()) {
            System.out.println("Pancake не приготовлен");
        }
        else {
            System.out.println("Pancake приготовлен");
        }
    }
    public void pancakeQuestion(Pancake pancake) {
        System.out.println(name + " спрашивает про pancake \"" + pancake.getName() + "\"");
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person respondent = (Person) o;
        return getName().equals(respondent.getName())
                && getStatus() == respondent.getStatus()
                && getCondition() == respondent.getCondition();
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getStatus(), getCondition());
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", status=" + getStatus() +
                ", condition=" + getCondition();
    }
}
