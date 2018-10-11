public class Singleton{

    //インスタンスの作成
    private static Singleton singleton = new Singleton();

    //コンストラクタ：newされると同時に生成される。
    private Singleton(){
        System.out.println("インスタンスの作成");
    }
    public static Singleton getInstance(){
        return singleton;
    }
}

