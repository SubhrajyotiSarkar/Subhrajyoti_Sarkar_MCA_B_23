import java.util.*;

class complex {
    int real, im;

    complex(int real, int im) {
        this.real = real;
        this.im = im;
    }

    void add(complex o) {
        int real = this.real + o.real;
        int im = this.im + o.im;

        System.out.print("Addition: " + real + " + " + im + "i");
    }
}

class q3_add_complex_numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int r1, i1, r2, i2;
        System.out.print("Enter First Real Part: ");
        r1 = sc.nextInt();
        System.out.print("Enter First Imaginary Part: ");
        i1 = sc.nextInt();
        System.out.print("Enter Second Real Part: ");
        r2 = sc.nextInt();
        System.out.print("Enter Second Imaginary Part: ");
        i2 = sc.nextInt();
        complex obj1 = new complex(r1, i1);
        complex obj2 = new complex(r2, i2);
        obj1.add(obj2);
    }
}
