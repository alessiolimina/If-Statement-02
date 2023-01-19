package it.develhope.ifstatement;

public class Start {
    public static void main(String[] args) {

       System.out.println("-----------------Starting---------------");

       String mySurname = "Limina";

       String result = mySurname.contains("ni") ? "Your surname contains the sequence of letters 'ni'" : "Your surname doesn't contain the sequence of letters 'ni'";

       System.out.println(result);

       System.out.println("----------------------------------------");

    }
}
