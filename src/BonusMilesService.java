public class BonusMilesService {
    public int calculate(int price) {
        int result;
        int numberBonuses = 20;
        result = price / numberBonuses;
        return result;
    }
 }
