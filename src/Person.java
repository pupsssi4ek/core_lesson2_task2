public class Person {
    private String name;
    private String surname;
    private int age;
    private Sex sex;
    private Education education;

    public Person(String name, String surname, int age, Sex sex, Education education) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getSurname() {
        return surname;
    }

    public Education getEducation() {
        return education;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", education=" + education +
                '}';
    }
}
