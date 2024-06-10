public class Animal {
    protected static int totalAnimals = 0;
    protected static int totalCats = 0;
    protected static int totalDogs = 0;

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        totalAnimals++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать такое расстояние");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не может проплыть такое расстояние");
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 200, 0);
        Cat cat2 = new Cat("Murka", 150, 0);
        Dog dog1 = new Dog("Rex", 500, 10);
        Dog dog2 = new Dog("Buddy", 400, 15);

        cat1.run(150);
        cat1.swim(100);
        cat1.eat(5);

        dog1.run(400);
        dog1.swim(5);

        System.out.println("Total animals created: " + totalAnimals);
        System.out.println("Total cats created: " + totalCats);
        System.out.println("Total dogs created: " + totalDogs);
    }
}

class Cat extends Animal {
    private int foodBowl = 10;
    private boolean isHungry = true;

    public Cat(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        totalCats++;
    }

    public void eat(int foodAmount) {
        if (isHungry && foodAmount <= foodBowl) {
            System.out.println(name + " поел " + foodAmount + " еды");
            foodBowl -= foodAmount;
            isHungry = false;
            if (!isHungry) {
                System.out.println(name + " сыт");
            }
        } else if (foodAmount > foodBowl) {
            System.out.println("В миске не хватает еды, чтобы накормить " + name);
        }
    }
}
class Dog extends Animal {
    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        totalDogs++;
    }
}