package Miscellaneous;

interface FuncInterface {
    void abstractFun(int x);

    // default void print() {
    // System.out.println("ff");
    // }
}

public class LambdaEx {
    public static void main(String[] args) {
        FuncInterface o = i -> System.out.println(2 * i);
        o.abstractFun(5);
    }
}
