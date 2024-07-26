
interface Mango {
    void displayType();
}
class Winter implements Mango {
    public void displayType() {
        System.out.println("This is a Winter Mango.");
    }
}

class Summer implements Mango {
    public void displayType() {
        System.out.println("This is a Summer Mango.");
    }
}

public class q15_mango_summer_winter {
    public static void main(String[] args) {
        Winter winterMango = new Winter();
        Summer summerMango = new Summer();
        winterMango.displayType();
        summerMango.displayType();
    }
}
