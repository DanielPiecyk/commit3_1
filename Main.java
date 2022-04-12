import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int wybor = 1,wiek;
    String imie,nazwisko,data;
    try {
      Service1 s = new Service1();
       while(wybor!=0) 
    {
       System.out.print("2.Wyswietlanie\n1.Dodaj studenta\n0.zakończ program\n");
      wybor = sc.nextInt();
      switch(wybor)
        {
            case 2:
            {/*wyswietlanie*/
             var students = s.getStudents();
             for(Student current : students) 
             {
             System.out.println(current.ToString());
               
            }
              break;
            }
          case 1:
            {/*dodaj studenta*/
              System.out.print("Podaj imię :\n");
              sc.nextLine();
              imie = sc.nextLine();
              System.out.print("Podaj nazwisko :\n");
              nazwisko = sc.nextLine();
              System.out.print("Podaj wiek :\n");
              wiek = sc.nextInt();
              System.out.print("Podaj datę urodzenia :\n");
              sc.nextLine();
              data = sc.nextLine();
              s.addStudent(new Student(imie, wiek,nazwisko,data));
              break;
              }
          case 0:
            {break;}
        }
    }
    } catch (IOException e) {

    }
  }
}