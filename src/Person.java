public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAge() {
        return age >= 0;
    }


    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return (surname == null) ? name : name + " " + surname;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 17;
        result = prime * result + (name != null ? name.hashCode() : 0);
        result = prime * result + (surname != null ? surname.hashCode() : 0);
        result = result + age;
        result = result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }
}



