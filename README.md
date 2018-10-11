# Javaでオブジェクト指向の学習

### Template
テンプレートメソッドは次の2つのオブジェクトによって構成

スーパークラスで処理の枠組みを決め、サブクラスで具体的な内容を定めるデザインパターンをTemplate Methodパターンと呼ぶ。

* 骨格としての「抽象的なベースのクラス」
* 実際の処理を行う「サブクラス」

[Main.java]

```
public class Main{
    public static void main(String[] args) {
        Animal active1 = new Dog("ドッグフード");
         //Animal active2 = new Dog("スヤスヤ");
        active1.life();}
        //active2.life(); 
}
```

[Animal.java]

```
public abstract class Animal {
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
```
[Dog.java]

```
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

```

説明
Animalクラスで骨組みであるlife()メソッドを作っておき、その後、Dogクラスで内容をear()とslee()の内容を定義する
