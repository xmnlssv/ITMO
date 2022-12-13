public enum Status {
    NEUTRAL("нейтральный"),
    ANGRY("злой"),
    HAPPY("весёлый"),
    SAD("грустный");

    private String name;

    Status(String name){
        this.name = name;
    }
}
