import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class AHuman implements IPerson {
    protected String name;
    protected final String defaultName = "Некто";
    protected Status status;
    protected Condition condition = Condition.SITTING;
    protected final Status defaultStatus = Status.NEUTRAL;

    AHuman() {
        name = defaultName;
        status = defaultStatus;
    }

    AHuman(String name) {
        this.name = name;
        status = defaultStatus;
    }

    AHuman(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public void setStatus(Status status) {
        System.out.println(name + " становится " + status.name());
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public Condition getCondition() {
        return condition;
    }

    public void say(String replica) {
        System.out.println(name + " говорит \"" + replica + "\".");
    }

    public void listen() {
        System.out.println(name + " слушает, что говорят");
    }

    public void question(String replica) {
        System.out.println(name + " спрашивает: \"" + replica + "\".");
    }

    public void answer(String replica) {
        System.out.println(name + " отвечает: \"" + replica + "\".");
    }

    public void standUp() {
        if (condition == Condition.STANDING) {
            System.out.println(name + " уже стоит.");
            return;
        } else {
            System.out.println(name + " встает.");
            condition = Condition.STANDING;
        }
    }

    public void sitDown() {
        if (condition == Condition.SITTING) {
            System.out.println(name + " уже сидит.");
            return;
        }
        else {
            System.out.println(name + " садиться.");
        }

    }
}
