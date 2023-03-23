package za.ac.cput.domain;
/* Drinks.java
 Entity for the Drinks
 Author: Reece Bergstedt - 221075240
 Date: 22 March 2023
*/

import java.util.Objects;

public class Drinks {

    private String drinkID;
    private String drinkType;
    private String drinkName;
    private Double drinkPrice;
    private String drinkDescription;

    private Drinks() {

    }

    public String getDrinkID() {
        return drinkID;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public Double getDrinkPrice() {
        return drinkPrice;
    }

    public String getDrinkDescription() {
        return drinkDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drinks drinks = (Drinks) o;
        return Objects.equals(drinkID, drinks.drinkID) && Objects.equals(drinkType, drinks.drinkType) && Objects.equals(drinkName, drinks.drinkName) && Objects.equals(drinkPrice, drinks.drinkPrice) && Objects.equals(drinkDescription, drinks.drinkDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drinkID, drinkType, drinkName, drinkPrice, drinkDescription);
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkID='" + drinkID + '\'' +
                ", drinkType='" + drinkType + '\'' +
                ", drinkName='" + drinkName + '\'' +
                ", drinkPrice=" + drinkPrice +
                ", drinkDescription='" + drinkDescription + '\'' +
                '}';
    }

    private Drinks(Drinks.Builder b) {
        this.drinkID = b.drinkID;
        this.drinkName = b.drinkName;
        this.drinkType = b.drinkType;
        this.drinkPrice = b.drinkPrice;
        this.drinkDescription = b.drinkDescription;
    }

    public static class Builder {
        private String drinkID;
        private String drinkType;
        private String drinkName;
        private Double drinkPrice;
        private String drinkDescription;


        public Builder setDrinkID(String drinkID) {
            this.drinkID = drinkID;
            return this;
        }

        public Builder setDrinkType(String drinkType) {
            this.drinkType = drinkType;
            return this;

        }

        public Builder setDrinkName(String drinkName) {
            this.drinkName = drinkName;
            return this;

        }

        public Builder setDrinkPrice(Double drinkPrice) {
            this.drinkPrice = drinkPrice;
            return this;

        }

        public Builder setDrinkDescription(String drinkDescription) {
            this.drinkDescription = drinkDescription;
            return this;

        }

        public Builder copy(Drinks drink){
            this.drinkID = drink.drinkID;
            this.drinkName = drink.drinkName;
            this.drinkType = drink.drinkType;
            this.drinkPrice = drink.drinkPrice;
            this.drinkDescription = drink.drinkDescription;
            return this;
        }

        public Drinks build(){
            return new Drinks(this);
        }
    }
}
