package pl.maniaq;

public class Main {

    //Zadanie 1 - I wersja - wyświetli napis, jednak z napisem nic nie możemy zrobić!
    public static void helloSysout(String name, String lastName){
        System.out.println("Hello I am " + name + " " +lastName);
    }

    //Zadanie 1 - II wersja dużo lepsza - Stringa możemy użyć teraz wszędzie, nawet zapisać do pliku
    public static String helloStr(String name, String lastName){
        return "Hello I am " + name + " " +lastName;
    }

    //Zadanie 2
    public static int findMin(int [] numbers) {
        int min = Integer.MAX_VALUE;
        for(int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    //Zadanie 3
    public static int findMax(int [] numbers) {
        int max = Integer.MIN_VALUE;
        for(int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    //Zadanie 4
    public static void displayArray(int [] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    //Zadanie 5
    public static int sum(int [] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }

    //Zadanie 6
    public static float average(int [] numbers) {
        // użycie metody sum(numbers) do obliczenia sumy wszystkich liczb potrzebnych do obliczenia srednych
        // nie wymyślajmy koła na nowo!
        // Używajmy funkcji/komponentów które już istnieją!
        return sum(numbers) / (float) numbers.length;
    }

    public static void main(String[] args) {
	    int [] numbers = {12, 5, 4, 16, 19, 12, 40, 99};
	    int min = findMin(numbers);
	    int max = findMax(numbers);
	    int sum = sum(numbers);
	    float average = average(numbers);

	    String hello = helloStr("Kamil", "Klimek");

	    // Wyniku funkcji typu void nie możemy przypisać do żadnej zmiennej
        // ponieważ nie mamy typu prymitywnego void
        // tak jak int, double, boolean itd.
	    helloSysout("Kamil", "Klimek");
	    displayArray(numbers);
	    System.out.println("Drugie powitanie: "+ hello);
	    System.out.println("element min: " + min);
        System.out.println("element max: " + max);
        System.out.println("Suma: " + sum);
        System.out.println("Średnia: " + average);
    }
}
