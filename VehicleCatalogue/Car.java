package VehicleCatalogue;


        public class Car {
            //poleta -> harakteristiki
            private String type;
            private String model;
            private String color;
            private int horsePower;

            // konsturktor - suzdavame obekti ot tozi klas
            public Car(String type, String model, String color, int horsePower) {
                this.setType(type);
                this.model = model;
                this.color = color;
                this.horsePower = horsePower;
            }
//getter

            public String getModel() {
                return this.model;
            }

            public String getType() {
                return type;
            }

            private void setType(String type) {
                //za da napravim glavna purvata bukva, kakto e po uslovie
                type = type.replace(type.charAt(0), Character.toUpperCase(type.charAt(0)));
                this.type = type;
            }

            public String getColor() {
                return this.color;
            }

            public int getHorsePower() {
                return this.horsePower;
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







