package ashita.java2;

interface Furniture{
    void stresstest();
    void firetest();
}
class Woodenchair implements Furniture{
    @Override
    public void firetest() {
        System.out.println("fire test failed");
    }

    @Override
    public void stresstest() {
        System.out.println("stress test passed");
    }
}
class Woodentable implements Furniture{
    @Override
    public void stresstest() {
        System.out.println("stress test passed");
    }

    @Override
    public void firetest() {
        System.out.println("fire test failed");
    }
}
class MetalChair implements Furniture {
    @Override
    public void firetest() {
        System.out.println("fire test passed");
    }

    @Override
    public void stresstest() {
        System.out.println("stress test failed");
    }
}
class MetalTable implements Furniture{

    @Override
    public void stresstest() {
        System.out.println("stress test failed");
    }

    @Override
    public void firetest() {
        System.out.println("fire test passed");
    }
}

public class q9 {
    public static void main(String[] args) {
        Woodenchair wc=new Woodenchair();
        wc.firetest();
        wc.stresstest();

        Woodentable wt=new Woodentable();
        wt.firetest();

        wt.stresstest();


        MetalChair mc=new MetalChair();
        mc.firetest();
        mc.stresstest();

        MetalTable mt=new MetalTable();

        mt.firetest();
        mt.stresstest();
    }
}