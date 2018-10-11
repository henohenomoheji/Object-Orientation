public class Sample{

    //インスタンスの作成
    private static Sample sample = new Sample();

    //コンストラクタ：newされると同時に生成される。
    private Sample(){
        System.out.println("Sampleインスタンスの作成");
    }
    public static Sample getInstance(){
        return sample;
    }
}

