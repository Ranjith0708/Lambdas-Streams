package Lambda;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel> hotels = new ArrayList<>();
    public HotelService(){
        hotels.add(new Hotel("abc",1000,HotelType.THREE_STAR,2));
        hotels.add(new Hotel("def",900,HotelType.THREE_STAR,1));
        hotels.add(new Hotel("ghi",2000,HotelType.FIVE_STAR,4));
        hotels.add(new Hotel("jkl",2500,HotelType.FIVE_STAR,5));
        hotels.add(new Hotel("mno",1500,HotelType.FOUR_STAR,3));
    }
//Old method without lambda
//    public List<Hotel> priceLessThan(int price){
//        List<Hotel> filteredHotels = new ArrayList<>();
//        for(Hotel hotel:hotels){
//            if(hotelPrice(hotel,price)){
//                filteredHotels.add(hotel);
//            }
//        }
//        return filteredHotels;
//    }
//    private boolean hotelPrice(Hotel hotel,int price){
//        return hotel.getPrice()<=price;
//    }


    public List<Hotel> filter(FilterCondition filterCondition){
        List<Hotel> filteredHotels = new ArrayList<>();
        for(Hotel hotel:hotels){
            if(filterCondition.check(hotel)){
                filteredHotels.add(hotel);
            }
        }
        return filteredHotels;
    }
}
