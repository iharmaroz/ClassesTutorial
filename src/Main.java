import access.AccessTestOne;

import base.BaseClass;
import block.CarOne;

public class Main {

    public static void main(String[] args){
//        BaseAccessClass.BaseInnerClass inner = new BaseAccessClass().new BaseInnerClass();
//        inner.printInnerParam();
//        CarOne car = new  CarOne(72);
//        car.beepCar();
        runAccessTestOne();
    }

    private static void runAccessTestOne(){
        AccessTestOne one =  new AccessTestOne();
        AccessTestOne two =  new AccessTestOne();

        one.testAccess(two);
    }
}
