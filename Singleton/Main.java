public class Main{
    public static void main (String[] args){

        System.out.println("start:");

        //静的フィールドへのアクセス
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("同じインスタンス");
        }else{
            System.out.println("異なるインスタンス");
        }
        System.out.println("end:");

        System.out.println("start:Sample");

        Sample obj3 = Sample.getInstance();
        Sample obj4 = Sample.getInstance();
        if(obj3 == obj4){
            System.out.println("同じインスタンス");
        }else{
            System.out.println("異なるインスタンス");
        }
        System.out.println("end:Sample");

    }
}