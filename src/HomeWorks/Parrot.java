package HomeWorks;

public class Parrot {
    private String breed;
    private String name;
    private String color;
    private byte lifespan;

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

    public byte getLifespan() {
        return lifespan;
    }

    public void setLifespan(byte lifespan) {
        if (lifespan<=0){
            System.err.println("Lifespan is valid");
        }
        this.lifespan = lifespan;
    }

    public String parrotInfo() {
        return "Parrot information: " +'\n'+
                "Breed: " + breed + '\n' +
                "Name: " + name + '\n' +
                "Color: " + color + '\n' +
                "Lifespan: " + lifespan+'\n';
    }
}
