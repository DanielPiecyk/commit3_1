public class Student {

  private String Name;
  private String Nazwisko;
  private int Age;
  private String Dataur;

  public Student(String name, int age,String nazwisko,String data) {
    Name = name;
    Age = age;
    Nazwisko = nazwisko;
    Dataur = data;
  }
  public String GetNazwisko() {return Nazwisko;}
  public String GetName() {return Name;}
  public String GetDataur() {return Dataur;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Integer.toString(Age)+" "+Nazwisko+" "+ Dataur;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", -1,"Parse Error","Parse Error");
    return new Student(data[0], Integer.parseInt(data[1]),data[2],data[3]);
  }
}