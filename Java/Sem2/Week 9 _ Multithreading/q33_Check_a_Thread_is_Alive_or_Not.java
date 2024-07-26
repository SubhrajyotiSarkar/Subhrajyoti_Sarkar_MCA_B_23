interface MyInterface {
    void display();
}

interface MyExtendedInterface extends MyInterface {
    void show();
}

public class q33_Check_a_Thread_is_Alive_or_Not implements MyExtendedInterface {
    public void display() {
        System.out.println("Display method implementation");
    }

    public void show() {
        System.out.println("Show method implementation");
    }

    public static void main(String[] args) {
        q33_Check_a_Thread_is_Alive_or_Not example = new q33_Check_a_Thread_is_Alive_or_Not();
        example.display();
        example.show();
    }
}
