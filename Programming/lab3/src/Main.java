public class Main {
    public static void main(String[] args) {
        //создаем Pancake на молоке, который должны съесть
        Pancake pancake = new Pancake("Pancake на молоке", Staffing.CURD);
        pancake.meal("кухня");

        //создаем действующие лица
        Person karlson = new Person("Карлсон", Status.HAPPY);
        karlson.sitDown();
        Person julius = new Person("Юлиус");
        julius.sitDown();
        Person kid = new Person("Малыш", Status.ANGRY);
        kid.standUp();

        //создаем диалог
        kid.pancakeQuestion(pancake);
        julius.pancakeReport(pancake);
        kid.question("Как блины на вкус");
        karlson.answer("Очень вкусные");
    }
}