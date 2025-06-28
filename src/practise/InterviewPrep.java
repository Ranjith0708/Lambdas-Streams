package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewPrep {
    public static void main(String[] args) {
        List<Employe> employeList = Arrays.asList(
                new Employe("Alice", "Engineering", 85),
                new Employe("Bob", "Engineering", 92),
                new Employe("Charlie", "HR", 78),
                new Employe("David", "HR", 82),
                new Employe("Eve", "Sales", 90),
                new Employe("Frank", "Sales", 88),
                new Employe("Grace", "Marketing", 95),
                new Employe("Heidi", "Marketing", 91),
                new Employe("Ivan", "Support", 80),
                new Employe("Judy", "Support", 87)
        );
        Map<String,Employe> empList = findMaxCommitByDept(employeList);
        for (Map.Entry<String, Employe> entry : empList.entrySet()) {
            System.out.println("Department: " + entry.getKey() +
                    ", Employee: " + entry.getValue().name +
                    ", Commit %: " + entry.getValue().commitPercent);
        }

    }

    public static Map<String,Employe> findMaxCommitByDept(List<Employe> employeList){
        Map<String,Employe> filteredEmployee = new HashMap<>();
        for(Employe employe:employeList){
            if(!filteredEmployee.containsKey(employe.department) || filteredEmployee.get(employe.department).commitPercent<employe.commitPercent){
                filteredEmployee.put(employe.department,employe);
            }
        }
        return filteredEmployee;
    }
}
