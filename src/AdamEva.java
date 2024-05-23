public class AdamEva {
    public static void main(String[] args) {
        Apple apple = new Apple(10);
        Human Adam = new Human("Adam", true,50);
        Human Eva = new Human("Eva", false, 35);
    }
}

class Apple {
    int weight;

    Apple(int weight) {
        this.weight = weight;
    }

    public void decrease() {
        if (weight > 0) {
            weight--;
        }
    }

    public boolean isEmpty() {
        return weight != 0;
    }

    public int getWeight(int a) {
        weight = a;
        return weight;
    }
}

class Human {
    Apple apple = new Apple(10);
    String name;
    boolean gender;
    int weight;

    Human(String name, boolean gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    public boolean isMale() {
        if (!gender) {
            return false;
        } else {
            return true;
        }
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean checkApple(Apple apple) {
        if (apple.isEmpty()) {
            return false;
        }
        return true;
    }
    public void eat(Apple apple){
        apple.decrease();
        weight++;
    }

    public void say(String something){
        System.out.println(something);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
