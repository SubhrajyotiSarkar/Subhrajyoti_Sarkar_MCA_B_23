interface Interface1 {
    void method1a();
    void method1b();
}

interface Interface2 {
    void method2a();
    void method2b();
}
interface Interface3 {
    void method3a();
    void method3b();
}
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}
class MyClass extends SomeConcreteClass implements CombinedInterface {
    @Override
    public void method1a() {
        System.out.println("Implementation of method1a");
    }

    @Override
    public void method1b() {
        System.out.println("Implementation of method1b");
    }

    @Override
    public void method2a() {
        System.out.println("Implementation of method2a");
    }

    @Override
    public void method2b() {
        System.out.println("Implementation of method2b");
    }

    @Override
    public void method3a() {
        System.out.println("Implementation of method3a");
    }

    @Override
    public void method3b() {
        System.out.println("Implementation of method3b");
    }

    @Override
    public void newMethod() {
        System.out.println("Implementation of newMethod");
    }
}
class SomeConcreteClass {

}

public class q5_interface4s {
        public static void methodWithInterface1(Interface1 obj) {
        System.out.println("Method with Interface1 argument");
        obj.method1a();
        obj.method1b();
    }

       public static void methodWithInterface2(Interface2 obj) {
        System.out.println("Method with Interface2 argument");
        obj.method2a();
        obj.method2b();
    }

       public static void methodWithInterface3(Interface3 obj) {
        System.out.println("Method with Interface3 argument");
        obj.method3a();
        obj.method3b();
    }

    public static void methodWithCombinedInterface(CombinedInterface obj) {
        System.out.println("Method with CombinedInterface argument");
        obj.method1a();
        obj.method1b();
        obj.method2a();
        obj.method2b();
        obj.method3a();
        obj.method3b();
        obj.newMethod();
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        methodWithInterface1(myObj);
        methodWithInterface2(myObj);
        methodWithInterface3(myObj);
        methodWithCombinedInterface(myObj);
    }
}
