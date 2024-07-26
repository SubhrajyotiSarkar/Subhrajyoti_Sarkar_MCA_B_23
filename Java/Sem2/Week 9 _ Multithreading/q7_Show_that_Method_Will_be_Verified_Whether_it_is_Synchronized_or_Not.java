import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class q7_Show_that_Method_Will_be_Verified_Whether_it_is_Synchronized_or_Not {
    public static void main(String[] args) {
        Method[] methods = SynchronizedClass.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            boolean isSynchronized = isMethodSynchronized(method);
            System.out.println("Synchronized: " + (isSynchronized ? "Yes" : "No"));
        }
    }

    private static boolean isMethodSynchronized(Method method) {
        return (method.getModifiers() & Modifier.SYNCHRONIZED) != 0;
    }
}

class SynchronizedClass {
    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized method is being executed.");
    }

    public void nonSynchronizedMethod() {
        System.out.println("Non-Synchronized method is being executed.");
    }
}