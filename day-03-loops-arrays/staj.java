package staj3;

public class staj {
    public static void main(String[] args) {

        System.out.println("Day 3 - Loops and Arrays");
        System.out.println("-------------------------");

        /*
         Loop yani döngü:
         Aynı işlemi tekrar tekrar yapmak için kullanılır.

         Mesela 1'den 10'a kadar sayıları yazdırmak istiyorsak
         tek tek System.out.println yazmak yerine döngü kullanırız.
        */

        System.out.println("For loop example:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println();

        /*
         for döngüsünün yapısı:

         for (başlangıç; koşul; artırma) {
             çalışacak kod
         }

         int i = 1  -> döngünün başlangıcı
         i <= 10    -> döngünün devam etme koşulu
         i++        -> her turdan sonra i değerini 1 artırır
        */

        System.out.println("While loop example:");

        int counter = 1;

        while (counter <= 10) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        System.out.println();

        /*
         while döngüsü:
         Koşul doğru olduğu sürece çalışır.

         counter <= 10 doğru olduğu sürece döngü devam eder.
         counter++ yazmazsak sonsuz döngü olabilir.
        */

        /*
         Array yani dizi:
         Aynı türden birden fazla veriyi tek değişkende tutmak için kullanılır.

        */

        int[] grades = {70, 80, 90, 60, 50};

        System.out.println("Array example:");
        System.out.println("First grade: " + grades[0]);
        System.out.println("Second grade: " + grades[1]);
        System.out.println("Third grade: " + grades[2]);

        System.out.println();

        /*
         Array index mantığı:

         int[] grades = {70, 80, 90, 60, 50};

         grades[0] -> 70
         grades[1] -> 80
         grades[2] -> 90
         grades[3] -> 60
         grades[4] -> 50

         Arraylerde index 0'dan başlar.
         İlk eleman 0. indexte olur.
        */

        System.out.println("Array length: " + grades.length);

        System.out.println();

        /*
         grades.length:
         Dizinin kaç elemanı olduğunu verir.

         Bu örnekte grades dizisinde 5 eleman var.
        */

        System.out.println("Printing all grades with for loop:");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade: " + grades[i]);
        }

        System.out.println();

        /*
         Bu döngü grades dizisinin bütün elemanlarını gezer.

         i = 0 -> grades[0]
         i = 1 -> grades[1]
         i = 2 -> grades[2]
         i = 3 -> grades[3]
         i = 4 -> grades[4]
        */

        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }

       
        System.out.println("Sum of grades: " + sum);
       

        System.out.println();

        /*
         sum değişkeni toplamı tutar.

         Başta sum = 0

         1. tur: sum = 0 + 70  = 70
         2. tur: sum = 70 + 80 = 150
         3. tur: sum = 150 + 90 = 240
         4. tur: sum = 240 + 60 = 300
         5. tur: sum = 300 + 50 = 350


        /*
         if ile ortalama kontrolü:
         Ortalama 50 veya üstüyse geçti.
         Değilse kaldı.
        */
        
        double average = (double) sum / grades.length;

        if (average >= 50) {
            System.out.println("Class average is passing.");
        } else {
            System.out.println("Class average is failing.");
        }

        System.out.println();

       

        }
    }
