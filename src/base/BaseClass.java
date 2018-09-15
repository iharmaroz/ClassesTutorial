package base;
/*
* The top-level class can be public or package-private only
* */
public class BaseClass extends BaseParent implements BaseInterface {
    /*
    * Here we can define
    * fields
    * constructors
    * methods
    * blocks
    * other classes
    * */

    int baseField = 1;

    BaseClass(){ }

    BaseClass(int param){ }

    BaseClass(int param1, Object param2){ }

    void firstMethod(){
        //do something
    }

    int secondMethod(int param){
        //do something
        return 0;
    }

    class BaseInnerClass {
        int f = baseField;
    }

    static class StaticInnerClass{

    }
}
