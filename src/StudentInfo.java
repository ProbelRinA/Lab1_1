import java.util.Scanner; //Importujemy klasy z pakietu java.util

public class StudentInfo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //Tworzymy obiekt klasy Scanner do wczytywania danych z klawiatury

        System.out.print("Name: "); //Wyświetlamy komunikat zachęcający użytkownika do wprowadzenia imienia
        String name = scanner.nextLine(); //Wczytujemy wprowadzone imię do zmiennej
        System.out.print("Surname: "); //To samo dla pobierania od użytkownika nazwiska
        String surname = scanner.nextLine(); //Wczytujemy wprowadzone nazwisko do zmiennej
        System.out.print("Group Number: "); //To samo dla pobierania od użytkownika numer grupy
        int groupnumber = scanner.nextInt(); //Wczytujemy wprowadzony numer do zmiennej

        System.out.println("Student Info: " + name + " " + surname + " Group " + groupnumber); //Wyświetlamy wprowadzone informacje

        scanner.close(); //Zamykamy obiekt Scanner
    }
}

