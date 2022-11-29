public enum Staffing {
    CURD("творог"),
    APPLE("яблоко"),
    THYME("тимьян");

    private String name;

    Staffing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
