package za.ac.cput.domain;
/* Food.java
 Entity for the Food
 Author: Reece Bergstedt - 221075240
 Date: 22 March 2023
*/
import java.util.Objects;

public class Food {

    private String foodID;
    private String foodType;
    private String foodName;
    private Double foodPrice;
    private String foodDescription;

    private Food(){

    }

    public String getFoodID() {
        return foodID;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return Objects.equals(foodID, food.foodID) && Objects.equals(foodType, food.foodType) && Objects.equals(foodName,food.foodName) && Objects.equals(foodPrice, food.foodPrice) && Objects.equals(foodDescription, food.foodDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodID, foodType, foodName, foodPrice, foodDescription);
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodID='" + foodID + '\'' +
                ", foodType='" + foodType + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodDescription='" + foodDescription + '\'' +
                '}';
    }

    private Food(Food.Builder b){
        this.foodID = b.foodID;
        this.foodName = b.foodName;
        this.foodType = b.foodType;
        this.foodPrice = b.foodPrice;
        this.foodDescription = b.foodDescription;
    }

    public static class Builder {
        private String foodID;
        private String foodType;
        private String foodName;
        private Double foodPrice;
        private String foodDescription;

        public Builder setFoodID(String foodID) {
            this.foodID = foodID;
            return this;
        }

        public Builder setFoodType(String foodType) {
            this.foodType = foodType;
            return this;

        }

        public Builder setFoodName(String foodName) {
            this.foodName = foodName;
            return this;

        }

        public Builder setFoodPrice(Double foodPrice) {
            this.foodPrice = foodPrice;
            return this;

        }

        public Builder setFoodDescription(String foodDescription) {
            this.foodDescription = foodDescription;
            return this;

        }

        public Builder copy(Food food){
            this.foodID = food.foodID;
            this.foodName = food.foodName;
            this.foodType = food.foodType;
            this.foodPrice = food.foodPrice;
            this.foodDescription = food.foodDescription;
            return this;
        }

        public Food build(){return new Food(this);
        }
    }
}
