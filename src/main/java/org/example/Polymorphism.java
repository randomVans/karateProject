package org.example;

//Overloading
class Operation{
    public int add(int a, int b){
        System.out.println("Hasil dari "+a +" + "+ b);
        return a+b;
    }

    //OverLoading: ubah int ke double
    public double add(double a, double b){
        System.out.println("Hasil dari "+a +" + "+ b);
        return a+b;
    }

    //overloading: Parameter menjadi 3 int
    public int add(int a, int b, int c){
        System.out.println("Hasil dari "+a +" + "+ b +" + "+c);
        return a+b+c;
    }
}

//Overiding
class MultiplyOveriding extends Operation{
    @Override
    public int add (int a, int b){
        return a*b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Operation op =  new Operation();
        Operation mulOv = new MultiplyOveriding();
        int result1 = op.add(5, 10);
        double result2 = op.add(2.5,5.5);
        int result3 = op.add(5,5,6);
        int result4 = mulOv.add(5,4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        try {
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Caught AritmathicExeption "+e.getMessage());
        }

        try {
            int[] arr = new int[5];
            int index = arr[10];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException "+e.getMessage());
        }

        try {
            String str = null;
            str.length();
        }catch (NullPointerException e){
            System.out.println("Caught NullPointerException"+ e.getMessage());
        }

        try {
            String string = "Hello";
            char ch = string.charAt(10);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Caught StringIndexOutOfBoundsException " + e.getMessage());
        }

        try {
            Thread t = new Thread();
            t.start();
            t.start();
        }catch (IllegalThreadStateException e){
            System.out.println("Caught IllegalStateException "+e.getMessage());
        }
    }
}
