public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private String adress;
    private City cityBirth;

    public Person(String name, String firstname, int age, String adress){
        this.lastName = name;
        this.firstName = firstname;
        this.age = age;
        this.adress = adress;
    }

    public Person(String name, String firstname, int age, String adress, City city){
        this.lastName = name;
        this.firstName = firstname;
        this.age = age;
        this.adress = adress;
        cityBirth = city;
    }

    @Override
    public String toString() {
        return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", adress=" + adress
                + ", citybirth" + cityBirth.city() + "]";
    }
    
}
