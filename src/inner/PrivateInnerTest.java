package inner;
/*
* http://skipy.ru/technics/access_modifiers.html
* */
public class PrivateInnerTest {
    private Inner inner;
    private int outerField = 10;

    public PrivateInnerTest(){
        inner = new Inner();
    }

    public void test(){
        System.out.println("Field: " + inner.field);
        System.out.println("Method: " + inner.getField());
    }

    private class Inner{

        private int field;

        private Inner(){
            field = 1;
        }

        private int getField(){
            return field;
        }
    }

    public static void main(String[] args) {
        PrivateInnerTest pit = new PrivateInnerTest();
        pit.test();
    }
}
