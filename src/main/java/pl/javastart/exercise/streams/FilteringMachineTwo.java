package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> filteredListPpl = new ArrayList<>();
        for (Person person : ppl) {
            if (person.getAge() < 18) {
                filteredListPpl.add(person.getName());
            }
        }
        return filteredListPpl;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> users = new ArrayList<>();
        for (Person person : people) {
            users.add(new User(person.getName(), person.getAge(), person.getName() + "_"+person.getAge()));
        }
        return users;
    }
}
