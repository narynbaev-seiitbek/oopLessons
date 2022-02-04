package HomeWorks;

public class Fish {
    private String name;
    private boolean predatory;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPredatory() {
        return predatory;
    }

    public void setPredatory(boolean predatory) {
        this.predatory = predatory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String fishInfo() {
        return "Fish information: " + '\n'+
                "name: " + name + '\n' +
                "predatory: " + predatory +'\n'+
                "color: " + color + '\n';
    }

}
