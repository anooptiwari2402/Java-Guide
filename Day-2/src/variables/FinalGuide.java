package variables;

public class FinalGuide {

    public static void main(String[] args) {

        FinalDemo demo = new FinalDemo(3);

        demo.demoCheck();

        FinalDemo demo1 = new FinalDemo(5);

        demo1.demoCheck();

    }
}


class FinalDemo{

    public final int demo;

    public FinalDemo(int demo){
        this.demo =demo;
    }

    public void demoCheck(){

        final int var1;

        var1 =5;

        System.out.println(demo);
    }

}
