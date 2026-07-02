package staj2;
import java.util.Scanner;
//scanner çalışması için*

public class staj {
	  public static void main(String[] args) {

	        System.out.println("Day 2 - If Else and Scanner");
	        System.out.println("----------------------------");

	        /*
	         if:
	         Koşul doğruysa çalışır.

	         else:
	         if koşulu yanlışsa çalışır.

	         else if:
	         Birden fazla koşul kontrol etmek için kullanılır.
	        */

	        int grade = 85;

	        if (grade >= 50) {
	            System.out.println("Student passed.");
	        } else {
	            System.out.println("Student failed.");
	        }

	        System.out.println();

	        /*
	         Karşılaştırma operatörleri:

	         ==  eşit mi?
	         !=  eşit değil mi?
	         >   büyük mü?
	         <   küçük mü?
	         >=  büyük veya eşit mi?
	         <=  küçük veya eşit mi?
	        */

	        int age = 22;

	        if (age >= 18) {
	            System.out.println("You are an adult.");
	        } else {
	            System.out.println("You are not an adult.");
	        }

	        System.out.println();

	        /*
	         else if örneği:
	         Not aralıklarına göre harf notu buluyoruz.
	        */

	        if (grade >= 90) {
	            System.out.println("Letter Grade: AA");
	        } else if (grade >= 80) {
	            System.out.println("Letter Grade: BA");
	        } else if (grade >= 70) {
	            System.out.println("Letter Grade: BB");
	        } else if (grade >= 60) {
	            System.out.println("Letter Grade: CB");
	        } else if (grade >= 50) {
	            System.out.println("Letter Grade: CC");
	        } else {
	            System.out.println("Letter Grade: FF");
	        }

	        System.out.println();

	        /*
	         Scanner:
	         Kullanıcıdan veri almak için kullanılır.
	         Scanner kullanmak için en üste import java.util.Scanner; yazılır.
	        */

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = input.nextLine();

	        System.out.print("Enter your exam grade: ");
	        int examGrade = input.nextInt();

	        System.out.println();

	        System.out.println("Name: " + name);
	        System.out.println("Exam Grade: " + examGrade);

	        if (examGrade >= 50) {
	            System.out.println(name + " passed the exam.");
	        } else {
	            System.out.println(name + " failed the exam.");
	        }

	        System.out.println();

	        /*
	         Kullanıcının girdiği nota göre harf notu bulma.
	        */

	        if (examGrade >= 90) {
	            System.out.println("Your Letter Grade: AA");
	        } else if (examGrade >= 80) {
	            System.out.println("Your Letter Grade: BA");
	        } else if (examGrade >= 70) {
	            System.out.println("Your Letter Grade: BB");
	        } else if (examGrade >= 60) {
	            System.out.println("Your Letter Grade: CB");
	        } else if (examGrade >= 50) {
	            System.out.println("Your Letter Grade: CC");
	        } else {
	            System.out.println("Your Letter Grade: FF");
	        }

	        input.close();
	    }
	}

