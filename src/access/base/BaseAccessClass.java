package access.base;

//public
//package-private
class BaseAccessClass {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    //private
    //package-private
    //protected
    public BaseAccessClass(){

    }

    //private
    //package-private
    //protected
    public void methodOne(){}

    //private
    //package-private
    //protected
    public class BaseInnerClass {
        private int a = 10;
        int b = 20;
        protected int c = 30;

        public void printInnerParam(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(BaseAccessClass.this.a);
            System.out.println(d);
        }
    }
}
