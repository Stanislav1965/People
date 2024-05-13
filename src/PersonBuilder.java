public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным числом!");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder newChildBuilder() {
        return this;
    }

    public Person build() throws IllegalStateException {
        if (this.name == null) {
            throw new IllegalStateException("Не хватает обязательных полей!");
        }
        return new Person(this.name, this.surname);
    }
}



