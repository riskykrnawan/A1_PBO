package pertemuan1.model;

public class Mouse {
    private String brand;
    private int weight;
    private int totalButton;
    private String color;

    // This is the Mouse default constructor
    public Mouse() {
        this.brand = "";
        this.weight = 0;
        this.totalButton = 0;
        this.color = "";
    }

    // This is the Mouse primary constructor
    public Mouse(String brand, int weight, int totalButton, String color) {
        this.brand = brand;
        this.weight = weight;
        this.totalButton = totalButton;
        this.color = color;
    }

    // This is the getter method for color
    public String getColor() {
        return color;
    }

    // This is the setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // This is the getter method for brand
    public String getBrand() {
        return brand;
    }

    // This is the setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // This is the getter method for weight
    public int getWeight() {
        return weight;
    }

    // This is the setter method for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // This is the getter method for totalButton
    public int getTotalButton() {
        return totalButton;
    }

    // This is the setter method for totalButton
    public void setTotalButton(int totalButton) {
        this.totalButton = totalButton;
    }
}
