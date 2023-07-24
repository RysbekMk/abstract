public class Cow extends Animal {
    public Cow(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\nCow{} " + super.toString();
    }
}
