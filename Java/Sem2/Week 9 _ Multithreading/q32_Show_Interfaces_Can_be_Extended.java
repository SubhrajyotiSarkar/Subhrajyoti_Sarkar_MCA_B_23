interface MyInterface {
    void display();
}

interface MyExtendedInterface extends MyInterface {
    void show();
}

public class q32_Show_Interfaces_Can_be_Extended implements MyExtendedInterface {
    public void display() {
        System.out.println("Display method implementation");
    }

    public void show() {
        System.out.println("Show method implementation");
    }

    public static void main(String[] args) {
        q32_Show_Interfaces_Can_be_Extended example = new q32_Show_Interfaces_Can_be_Extended();
        example.display();
        example.show();
    }
}
