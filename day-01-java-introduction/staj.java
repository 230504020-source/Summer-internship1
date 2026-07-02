package staj1.gün;

public class staj {
	// public dışarıdan erişilebilir demek 
    // main sınıfın adı (staj)
	
	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println("Hello");
		System.out.println("World");
		
		/* println yazar ve alt satıra geçer
		 * print yazar ama alt satıra geçmez.  */
		 


		
		System.out.print("Hello");
		System.out.print("World");
		
		int age = 22;
		double height = 1.78;
		char letterGrade = 'A';
		// char tek tırnak kullanılırken string iki tırnak kulllanılır
		boolean isStudent = true;
		String name = "Batuhan";
		
		/*
		int      -> tam sayı
		double   -> ondalıklı sayı
		char     -> tek karakter
		boolean  -> true / false
		String   -> metin
		*/
	 System.out.println("");
	 System.out.println(name);
	   System.out.println(age);
	   System.out.println("Name: " + name);
	   
	   // tek bir şekilde yazabiliriz
	   
	   /*
	   +  toplama
	   -  çıkarma
	   *  çarpma
	   /  bölme
	   %  kalan bulma
	   
	   */
	
	   int a = 10;
	   int b = 3;

	   System.out.println(a + b);
	   System.out.println(a - b);
	   System.out.println(a * b);
	   System.out.println(a / b);
	   System.out.println(a % b);
	   System.out.println(10 % 3);
	   
	   
	}
	
	
	}

