public abstract class Animal {
    abstract void makeSound(); // 抽象方法
}

public class Chicken extends Animal {
    public void makeSound() {
        System.out.println("咯咯咯");
    }
}

public class Duck extends Animal {
    public void makeSound() {
        System.out.println("嘎嘎嘎");
    }
}

Animal duck = new Duck(); // (1)
Animal chicken = new Chicken(); // (2)

public class AnimalSound {
    public void makeSound(Animal animal) { // 接受Animal 类型的参数
        animal.makeSound();
    }
}

public class Test {
    public static void main( String args[] ){
        AnimalSound animalSound= new AnimalSound ();
        Animal duck = new Duck();
        Animal chicken = new Chicken();
        animalSound.makeSound( duck ); // 输出嘎嘎嘎
        animalSound.makeSound( chicken ); // 输出咯咯咯
    }
}
