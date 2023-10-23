package YJM.src.main.java.practicePredicate;

import java.util.function.Predicate;

public class PredicateTest {

    public static Predicate<Person> isFemale() {
        return (Person p) -> "female".equals(p.getSex());
    }
    
    public static Predicate<Person> isAdult() {
        return (Person p) -> p.getAge() > 20;
    }

    public static void testMain() {
        Predicate<Person> predicateA = PredicateTest.isFemale();
        Predicate<Person> predicateB = PredicateTest.isAdult();

        Predicate<Person> predicateAB = predicateA.and(predicateB);

        Person person = new Person();
        person.setName("Rebecca");
        person.setAge(35);
        person.setSex("female");

        System.out.println(person.getName() + "'s result :" +predicateAB.test(person));
    }
}
