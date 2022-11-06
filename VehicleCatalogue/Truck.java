package VehicleCatalogue;


public class Truck {
    //poleta -> harakteristiki
private String type;
private String model;
private String color;
private int horsePower;
// konsturktor - suzdavame obekti ot tozi klas
    public Truck(String type, String model, String color, int horsePower){
        this.setType(type);
    this.model =model;
    this.color =color;
    this.horsePower =horsePower;
    }
//getter

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    private void setType(String type) {
        type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
        this.type = type;
    }

    public Truck setModel(String model) {
        this.model = model;
        return this;
    }

    public Truck setColor(String color) {
        this.color = color;
        return this;
    }

    public Truck setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }
    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                        "Model: %s%n" +
                        "Color: %s%n" +
                        "Horsepower: %d", this.getType(),
                this.getModel(), this.getColor(), this.getHorsePower());
    }
}





