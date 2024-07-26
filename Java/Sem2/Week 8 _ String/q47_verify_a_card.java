import java.lang.reflect.Method;
import java.util.Scanner;

public class q47_verify_a_card {
    public static void main(String[] args) {
        Class<StringBuffer> stringBufferClass = StringBuffer.class;

        Method[] stringBufferMethods = stringBufferClass.getDeclaredMethods();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Method Name: ");
        String methodName = sc.nextLine();

        boolean methodExists = false;
        for (Method method : stringBufferMethods) {
            if (method.getName().equals(methodName)) {
                methodExists = true;
                break;
            }
        }

        if (methodExists) {
            System.out.println("The method '" + methodName + "' exists in the StringBuffer class.");
        } else {
            System.out.println("The method '" + methodName + "' does not exist in the StringBuffer class.");
        }
        sc.close();
    }
}
