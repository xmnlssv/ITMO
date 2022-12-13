public interface IPerson {
    void standUp();
    void sitDown();
    void setStatus(Status status);
    Status getStatus();
    Condition getCondition();
}
