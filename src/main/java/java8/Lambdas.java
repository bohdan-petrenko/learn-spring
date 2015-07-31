package java8;

/**
 * Created by Petrenko on 16.07.2015.
 */
public class Lambdas {

    public static void main(String[] args) {
        FuncInterface fi = str -> str.trim().toUpperCase();
        System.out.println(fi.stringOp("fucking cunt"));
    }
}

interface FuncInterface {
    String stringOp(String str);
}