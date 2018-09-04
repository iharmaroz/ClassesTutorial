package access;

public class AccessTestOne {
    private int privateField = 0;

    public AccessTestOne(){}

    public void testAccess(AccessTestOne anotherObject) {
        anotherObject.privateField = 1;
        System.out.println("anotherObject.getPrivateField()=" + anotherObject.getPrivateField() );
        System.out.println("anotherObject.privateField=" + anotherObject.privateField );
    }

    private int getPrivateField(){
        return privateField;
    }
}
