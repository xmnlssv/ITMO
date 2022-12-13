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
        if (!(pancake.getPrepared())) {
            throw new NoPancakeException("Pancake не приготовлен, человек говорить не может");
        }
        else {
            System.out.println(name + " рассказывает про pancake :\"" + pancake.getName() + "\"");
            System.out.println("Pancake с начинкой " + pancake.getStaffing().getName());
            if (!pancake.getPrepared()) {
                System.out.println("Pancake не приготовлен");
            } else {
                System.out.println("Pancake приготовлен");
            }
        }
    }
    public void pancakeQuestion(Pancake pancake) {
        System.out.println(name + " спрашивает про pancake \"" + pancake.getName() + "\"");
    }

    public void railwayMuseum(String about_people, String about_view, String about_general){
        class Opinion{
            private String about_people;
            private String about_view;
            private String about_general;
            Opinion(String about_people, String about_view, String about_general){
                this.about_people = about_people;
                this.about_view = about_view;
                this.about_general = about_general;
            }
            public void give_opinion(){
                System.out.println("Мнение о железнодорожном музее:");
                System.out.println("О людях: " + about_people);
                System.out.println("О внешнем виде: " + about_view);
                System.out.println("Общее мнение: " + about_general);
            }
        }
        Opinion opinion = new Opinion(about_people, about_view, about_general);
        opinion.give_opinion();
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
                ", condition=" + getCondition() + "}";
    }
}
