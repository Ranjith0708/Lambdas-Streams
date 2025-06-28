package Lambda;

public class FilterByPrice2000 implements FilterCondition {

    @Override
    public boolean check(Hotel hotel) {
        return hotel.getPrice()<=1000;
    }
}
