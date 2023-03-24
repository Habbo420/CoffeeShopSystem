package za.ac.cput.factory;
/* FoodFactory.java
 Entity for the FoodFactory
 Author: Reece Bergstedt - 221075240
 Date: 22 March 2023
*/
import za.ac.cput.domain.Food;
import za.ac.cput.util.FoodHelper;

public class FoodFactory {
    public static Food buildFood(String foodName, String foodType, Double foodPrice, String foodDescription) {
        if (FoodHelper.isNullOrEmpty(foodName) == true || FoodHelper.isNullOrEmpty(foodType) == true || FoodHelper.isNullOrEmpty(foodDescription) == true || FoodHelper.isInvalidDouble(foodPrice)) {
            return null;
        }

        String foodID = FoodHelper.generateId();

        return new Food.Builder().setFoodID(foodID)
                .setFoodName(foodName)
                .setFoodType(foodType)
                .setFoodPrice(foodPrice)
                .setFoodDescription(foodDescription)
                .build();
    }
    }

