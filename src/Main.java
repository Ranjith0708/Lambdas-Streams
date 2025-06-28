import Lambda.FilterByPrice2000;
import Lambda.Hotel;
import Lambda.HotelService;
import Lambda.HotelType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HotelService hotelService = new HotelService();
//        List<Hotel> hotelList =  hotelService.priceLessThan();
        List<Hotel> hotelList =  hotelService.filter(new FilterByPrice2000());
        for(Hotel hotel : hotelList){
            System.out.println("Hotel name : "+hotel.getName()+","+"Price per night:"+hotel.getPrice());
        }
        /* Steps to pass functions as param
        * 1. Create an interface with required function
        * 2. Change the method to accept param of this interface and call the required method from the interface
        * 3. Create a concrete class which implements that interface
        * 4. Pass the object of that class in that method param
        */

        //Now passing lambda expression as function
        List<Hotel> fivestarHotel =  hotelService.filter(( hotel)->{
            return hotel.getHotelType()== HotelType.FIVE_STAR;
        });
        System.out.println(fivestarHotel.get(0).getName());
        List<Hotel> filterByRating = hotelService.filter((Hotel hotel)->{
            return hotel.getRating()>=3;
        });
        for(Hotel hotel : filterByRating){
            System.out.println("Hotel "+hotel.getName()+" has rating of "+hotel.getRating());
        }
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0) return 0;
        int l=0;
        int r=1;
        int sum=nums[l];
        int minSubArrLen = 0;
        if(sum==target) return l+1;
        while(l<nums.length && r<nums.length){
            sum+=nums[r];
            if(sum>target){
                sum-=nums[l];
                if(sum==target){
                    if(minSubArrLen>(r-l+1)){
                        minSubArrLen=r-l+1;
                    }
                }
                r++;
                continue;
            }
            if(sum==target){
                if(minSubArrLen>(r-l+1)){
                    minSubArrLen=r-l+1;
                }
            }
            r++;
        }
        return minSubArrLen;
    }
}