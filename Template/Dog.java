public class Dog extends Animal{
    private String string;

    public Dog(String string) {
        this.string = string;
    }

    public void eat() {
        System.out.println(string);

    }
    public void sleep() {
        System.out.println("寝る");

    }

} 