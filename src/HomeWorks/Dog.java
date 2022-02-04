package HomeWorks;

public class Dog {
    private String breed;
    private String name;
    private String color;
    private byte age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String dogInfo() {
        return "Dog information: " +'\n'+
                "Breed: " + breed + '\n' +
                "Name: " + name + '\n' +
                "Color: " + color + '\n' +
                "Age: " + age +'\n';
    }
}
