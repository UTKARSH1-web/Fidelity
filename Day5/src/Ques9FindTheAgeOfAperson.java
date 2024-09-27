import java.time.LocalDate;
import java.time.Period;
import java.util.Formatter;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Ques9FindTheAgeOfAperson {
    public static class Person {
        private String FirstName;
        private String LastName;
        private LocalDate BirthDate;

        public Person(String firstName, String lastName, LocalDate birthDate) {
            this.FirstName = firstName;
            this.LastName = lastName;
            this.BirthDate = birthDate;
        }
        public Person(){}

        public String getFirstName() {
            return FirstName;
        }
        public String getLastName() {
            return LastName;
        }

        public void setFirstName(String firstName) {
            this.FirstName = firstName;
        }
        public void setLastName(String lastName) {
            this.LastName = lastName;
        }
        public LocalDate getBirthDate() {
            return BirthDate;
        }
        public void setBirthDate(LocalDate birthDate) {
            this.BirthDate = birthDate;
        }

        public int getAge(LocalDate birthDate) {
            LocalDate now = LocalDate.now();
            if(birthDate != null && birthDate.isBefore(now)){
                return Period.between(birthDate, now).getYears();
            }
            else {
                return 0;
            }
        }
        public String isAdult(){
            int age = getAge(this.BirthDate);
            if(age >= 18){
                return "Adult";
            }
            else {
                return "Child";
            }
        }
        public void displayDet(){
            System.out.println("First Name: " + this.FirstName);
            System.out.println("Last Name: " + this.LastName);
            System.out.println("Birth Date: " + this.BirthDate);
            System.out.println("Age: " + getAge(this.BirthDate));
            System.out.println("Category: " + isAdult());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.println("Enter Birth Date: ");
        String birthDate = sc.nextLine();

        LocalDate date = LocalDate.parse(birthDate,dtf);

        Person person = new Person(firstName,lastName,date);
        person.displayDet();
        sc.close();
    }
}
