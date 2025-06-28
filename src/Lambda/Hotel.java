package Lambda;

public class Hotel {
    private String name;
    private int pricePerNight;
    private int rating;
    private HotelType hotelType;

    public  Hotel(String name, int pricePerNight, HotelType hotelTpe, int rating){
        this.name=name;
        this.pricePerNight = pricePerNight;
        this.hotelType=hotelTpe;
        this.rating=rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return pricePerNight;
    }

    public void setPrice(int price) {
        this.pricePerNight = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }


}
