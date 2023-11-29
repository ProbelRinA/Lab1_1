import java.util.Scanner; //Importujemy klasy z pakietu java.util

public class StudentInfo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //Tworzymy obiekt klasy Scanner do wczytywania danych z klawiatury

        System.out.print("Name: "); //Wyświetlamy komunikat zachęcający użytkownika do wprowadzenia dane
        String name = scanner.nextLine(); //Wczytujemy wprowadzone imię do zmiennej
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.print("Specialization: ");
        String specialization = scanner.nextLine();
        System.out.print("ID: ");
        int ID = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();

        //Wyświetlamy wprowadzone informacje
        System.out.println("\nStudent Info: " + "\nName: " + name + "\nSurname: " + surname + "\nSpecialization: " + specialization + "\nID: " + ID + "\nYear: " + year);

        scanner.close(); //Zamykamy obiekt Scanner
    }
}

