import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
ArrayList <Cats> catsArrayList=new ArrayList<>();

    public static void main(String[] args) {
        ArrayList <Cats> catsArrayList=new ArrayList<>();
        catsArrayList.add(new Cats("kramer",23));
        catsArrayList.add(new Cats("joe",28));
        catsArrayList.add(new Cats("kramer",21));
        catsArrayList.add(new Cats("Bob Lee",25));
        List<Cats> olderCats=new ArrayList<>();

        List <Integer> catAges =catsArrayList.stream()
                .skip(2)
                .peek(System.out::println)
                .limit(2)
                .map(cat -> cat.getAge())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(catAges);
        System.out.println(catsArrayList);
//        boolean match =catsArrayList.stream()
//                .skip(2)
//                .peek(System.out::println)
//                .limit(2)
//                .map(cat -> cat.getAge())
//
//                .anyMatch(age -> age ==25);
//        System.out.println(match);
    }

}
