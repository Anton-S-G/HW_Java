import java.util.ArrayList;

public class Contact {
    private final String name;
    private final ArrayList<Integer> numbers = new ArrayList<>();

    public Contact(String name, int number) {
        this.name = name;
        this.numbers.add(number);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void removeNumber(int number) {
        numbers.remove(Integer.valueOf(number));
    }

    public void removeAllNumbers() {
        numbers.clear();
    }

    @Override
    public String toString() {
        return name + ": " + numbers.toString();
    }
}