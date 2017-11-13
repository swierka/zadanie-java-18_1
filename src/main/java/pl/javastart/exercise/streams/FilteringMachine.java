package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachine {
    List<Integer> filteredList = new ArrayList<>();

    public List<Integer> filterOutEvenNumbers(List<Integer> numberList) {
        for (Integer item : numberList) {
            if (item % 2 == 0) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public List<Integer> filterOutHigherNumbersThan20(List<Integer> numberList) {
        for (Integer item : numberList) {
            if (item > 20) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> books = new ArrayList<>();
        for (String title : titles) {
            books.add(new Book(title));
        }
        return books;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> books = convertToBooks(titles);
        List<Book> filteredListOfBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().startsWith("Gra")) {
                filteredListOfBooks.add(book);
            }
        }
        return filteredListOfBooks;
    }
}
