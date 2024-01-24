package com.micro.limitsservice;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class FindFirst{
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        /*myList.stream()
                .findFirst()
                .ifPresent(System.out::println);*/

        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        (myList.stream().filter(e->!set.add(e)).collect(Collectors.toList())).forEach(System.out::println);

       int a= myList.stream().max(Integer::compareTo).get();
       System.out.println(a);

       List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1,"amar","it",30000));
        employeeList.add(new Employee(2,"ram","etc",50000));
        employeeList.add(new Employee(3,"gaurya","mech",4000));
        employeeList.add(new Employee(2,"Shyam","etc",50000));
Comparator salarycomp=Comparator.comparing(Employee::getSalary);
Comparator namecomp=Comparator.comparing(Employee::getEmpName);
//employeeList.stream().sorted(salarycomp.thenComparing(namecomp)).forEach(e->System.out.println(((Employee) e).getSalary()+"+++++"+((Employee) e).getEmpName()));
     //  double salary =employeeList.stream().max(Comparator.comparing(Employee::getSalary)).map(e->e.getSalary()).get();
        //System.out.println(salary);

        //double emp =employeeList.stream().distinct().sorted().skip(employeeList.size()-2).findFirst();

       /* System.out.println(employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .distinct()
                .boxed()// Remove duplicate salaries
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElse((double) 0));
*/
HashMap<Integer,String> hashmap1=new HashMap<>();

        hashmap1.put(1,"abc");
        hashmap1.put(2,"ads");
        hashmap1.put(1,"rtyssd");
        System.out.println(hashmap1.get(1));
        System.out.println(hashmap1.replace(1,"rty"));



String demo="java  is bad langlng";

HashSet<Character> set1=new HashSet();


char j=demo.chars().mapToObj(c->(char)c).filter(ch->!set1.add(ch)).findFirst().orElse('\0');
System.out.println(j);

demo.chars().mapToObj(ch->(char)ch).filter(te->!set1.add(te)).findFirst().orElse('\0');


employeeList.stream().mapToDouble(e->e.getSalary()).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse((double) 0);
employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
Map<Character,Long> result =demo.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        result.forEach((character, aLong) -> System.out.println(character+"is "+aLong));
        ArrayList<Character> newArrayList= new ArrayList<>();
        for (char c : demo.toCharArray()) {
            newArrayList.add(c);
        }

        removeDuplicates(newArrayList);

    }


    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
        ArrayList<T> newArrayList= new ArrayList<>();
        for(T element:list){

            if(!newArrayList.contains(element)){
                newArrayList.add(element);
            }
            else{
                System.out.println("duplicate element is"+ element);
             break;
            }

        }
        return newArrayList;

}
}