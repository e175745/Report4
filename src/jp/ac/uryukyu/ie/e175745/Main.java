package jp.ac.uryukyu.ie.e175745;
//https://github.com/e175745/Report4.git
public class Main {

    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Catch NullPointerException");
            System.out.println(e.getMessage());
        }
    }
}