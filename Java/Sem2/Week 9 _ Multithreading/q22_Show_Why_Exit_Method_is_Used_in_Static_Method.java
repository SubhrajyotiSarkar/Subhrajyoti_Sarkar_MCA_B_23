public class q22_Show_Why_Exit_Method_is_Used_in_Static_Method {
    public static void main(String[] args) {
        System.out.println("Main method is executing...");
        myStaticMethod();
    }

    public static void myStaticMethod() {
        System.out.println("Static method is executing...");
        System.exit(0);
    }
}
