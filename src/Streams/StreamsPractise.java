package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamsPractise {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "park");
        List<String> wordsWithoutNull = words.stream()
                .filter(str -> str != null)
                .collect(Collectors.toList());

        System.out.println("Original List: " + words);
        System.out.println("Filtered List (no nulls): " + wordsWithoutNull);

//        Product product = new Product(1,"asdddsads",121);

        Product product = new Product(1, "HP Laptop", 25000);
        Product product1 = new Product(2, "Dell Laptop", 30000);
        Product product2= new Product(3, "Acer Laptop", 28000);
        Product product3 = new Product(4, "Sony Laptop", 23000);
        Product product4 = new Product(5, "Lenova Laptop", 90000);
//
        List<Product> productList = Arrays.asList(product1,product4,product2,product,product3);
        List<Product> filtered = productList.stream().filter(produc->produc.price>=25000).collect(Collectors.toList());
       productList.stream().filter(produc->produc.price>=25000).forEach(n->{System.out.println(n.name);});

        System.out.println("Product List: " + filtered);

        List<String> fruits = Arrays.asList("apple", "banana", "avocado", "cherry");
        System.out.println("Fruits starts with a are : ");
        fruits.stream().filter(fruit->fruit.charAt(0)=='a').forEach(System.out::println);

        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> numsDist = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(numsDist);
        List<Integer> numsLs = Arrays.asList(1,1,2,4,4,5,3,3,10);
        List<Integer> sortedLs = numsLs.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(sortedLs.get((int)sortedLs.stream().count()-2));


    }


}



