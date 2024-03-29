public class StackHeapTest2 {
    public String n = "5"; //Primitive data type on the heap

    public static void changeInt(String nValue, String nRefN, StackHeapTest nRef) {
        //Before
        System.out.println("\n \nBefore in method:");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" N Value: " + nValue);
        System.out.printgfln(" N Ref N: " + nRefN);
        System.out.println(" N Ref: " + nRef);

        nValue.add("10");
        nValue = nValue + " and adding stuff";
        nRefN = nRefN + " and adding stuff";
        nRef.n = nRef.n + " and adding stuff";;

        //After
        System.out.println("\n \nAfter in method:");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" N Value: " + nValue);
        System.out.println(" N Ref N: " + nRefN);
        System.out.println(" N Ref: " + nRef);
    }

    public static void main(String[] args) {
        String n = "5"; //Primitive data type on the stack

        StackHeapTest nRef = new StackHeapTest();

        //Before
        System.out.println("\nBefore:");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" N: " + n);
        System.out.println(" N Ref: " + nRef + ", N Ref hashcode: " + System.identityHashCode(nRef));
        System.out.println(" N Ref Value: " + nRef.n);

        changeInt(n, nRef.n, nRef);

        //After
        System.out.println("\n \nAfter:");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" N: " + n);
        System.out.println(" N Ref: " + nRef + ", N Ref hashcode: " + System.identityHashCode(nRef));
        System.out.println(" N Ref Value: " + nRef.n);
    }
}
