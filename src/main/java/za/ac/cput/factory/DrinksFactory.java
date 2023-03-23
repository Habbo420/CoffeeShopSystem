package za.ac.cput.factory;
/* DrinksFactory.java
 Entity for the Drinks
 Author: Reece Bergstedt - 221075240
 Date: 22 March 2023
*/
import za.ac.cput.domain.Drinks;
import za.ac.cput.util.DrinksHelper;



public class DrinksFactory {

    public static Drinks buildDrink(String drinkName, String drinkType, Double drinkPrice, String drinkDescription) {
        if (DrinksHelper.isNullOrEmpty(drinkName) == true || DrinksHelper.isNullOrEmpty(drinkType) == true || DrinksHelper.isNullOrEmpty(drinkDescription) == true || DrinksHelper.isInvalidDouble(drinkPrice)) {
            return null;
        }

        String drinkID = DrinksHelper.generateId();

        return new Drinks.Builder().setDrinkID(drinkID)
                .setDrinkName(drinkName)
                .setDrinkType(drinkType)
                .setDrinkPrice(drinkPrice)
                .setDrinkDescription(drinkDescription)
                .build();
    }
}
