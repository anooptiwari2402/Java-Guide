package variables;

public class StaticVariable {
    public static void main(String[] args){

        Main main1 = new Main();
        Main main2 = new Main();

        main1.increment();

        System.out.println("Main1 withoutstatic: "+main1.getWithoutStatic());
        System.out.println("Main1 withStatic: "+main1.getWithStaticCount());


        main2.increment();


        System.out.println("Main2 withStatic: "+main2.getWithStaticCount());
        System.out.println("Main2 withoutstatic: "+main2.getWithoutStatic());
    }
}

class Main{
    public static int withStaticCount = 0;
    public int withoutStatic = 0;

    public void increment(){
        withoutStatic++;
        withStaticCount++;
    }

    public int getWithStaticCount(){
        return withStaticCount;
    }
    public int getWithoutStatic(){
        return withoutStatic;
    }
}