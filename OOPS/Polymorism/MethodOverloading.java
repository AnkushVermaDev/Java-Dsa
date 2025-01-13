/*
                          Occurs during COMPILE TIME POLYMORISM

Method overloading occurs when two or more methods in the same class have the same name but different parameter lists (different number or types of parameters).

*/

public class MethodOverloading{


    static void add(int a,int b){

        System.out.println(a*b);

    }

    static void add(int a,int b,int c){

        System.out.println(a*b*c);

    }
    static void add(float k,float m,float n){

        System.out.println(k*m*n);

    }

    public static void main(String[] args) {
        


        add(12, 2);

        add(2, 3, 4);

        add(5.2f, 3.3f, 8.8f);

    }
}