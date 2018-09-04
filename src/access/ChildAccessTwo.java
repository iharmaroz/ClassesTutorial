package access;

public class ChildAccessTwo extends AccessTestTwo {
    public void testAccess(AccessTestTwo anotherObject) {
        anotherObject.protectedField = 3;
        System.out.println("anotherObject.getProtectedField()="+anotherObject.getProtectedField() );
        System.out.println("anotherObject.protectedField="+anotherObject.protectedField );
    }
}
