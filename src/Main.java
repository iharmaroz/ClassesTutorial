import access.AccessTestOne;

public class Main {

    public static void main(String[] args){
        runAccessTestOne();
    }

    private static void runAccessTestOne(){
        AccessTestOne one =  new AccessTestOne();
        AccessTestOne two =  new AccessTestOne();

        one.testAccess(two);
    }
}
