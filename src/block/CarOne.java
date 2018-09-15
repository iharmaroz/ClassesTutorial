package block;

public class CarOne {
    {
        System.out.println("QA First block a = " + this.a);
    }

    static {
        System.out.println("QA Static block");
    }

    private int a = 27;

    public CarOne(int a){
        this.a = a;
        System.out.println("QA Constructor a = " + this.a);
    }

    {
        System.out.println("QA Second block a = " + this.a);
    }

    public void beepCar(){
        int a = 1;
        System.out.println("QA beepCar start a = " + a);

        {
            int b = 2;
            a = b + this.a;
            System.out.println("QA beepCar block a = " + a);
            System.out.println("QA beepCar block this.a = " + this.a);
        }

        int c = a + 2;
        System.out.println("QA beepCar a = " + a);
    }
}

