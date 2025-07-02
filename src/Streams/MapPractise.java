package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractise {
    public static void main(String[] args) {
//        Input: List<Integer> nums = [1, 2, 3, 4]
//        Output: [1, 4, 9, 16]
        List<Integer> nums = Arrays.asList(1,2,3,4);
        List<Integer> squaredNums = nums.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println(squaredNums);

//        Input: ["apple", "banana", "cherry"]
//        Output: ['a', 'b', 'c']
        List<String> input = Arrays.asList("apple","banana","cherry");
        List<String> fruitsFirstLetter = input.stream().map(fruit->fruit.substring(0,1)).collect(Collectors.toList());
        System.out.println(fruitsFirstLetter);

//        Input: List<Employee>
//        Output: List<String> (names)
        Employee emp = new Employee("Ranjith",24);
        Employee emp1=new Employee("Lavanya",25);
        Employee emp2=new Employee("Bhavani",26);
        List<Employee> employees = Arrays.asList(emp,emp1,emp2);
        List<String> empNames = employees.stream().map(e->e.name).sorted().collect(Collectors.toList());
        System.out.println(empNames);

//        Input: [2, 5, 8]
//        Output: ["10", "101", "1000"] //binary string
        List<Integer> inputNum = Arrays.asList(2,5,6);
        List<String> binaryString = inputNum.stream().map(num->Integer.toBinaryString(num)).collect(Collectors.toList());
        System.out.println(binaryString);
    }
}
class Employee {
    String name;
    int age;
    Employee(String name,int age){
        this.name = name;
        this.age = age;
    }
}

