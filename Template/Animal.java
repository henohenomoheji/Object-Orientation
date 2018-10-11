public abstract class Animal {

    //abstract:抽象メソッド
    public abstract void eat();
    public abstract void sleep();


    //Template Method
    public final void life() {
        for (int i =0; i < 3; i++) {
        eat();
        }
        sleep();
    }
}