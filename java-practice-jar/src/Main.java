import com.petshop.Cat;
import com.petshop.Dog;
import com.petshop.Pet;

public class Main {
    public static void main(String[] args) {
        Pet.intro();
        Pet cat = new Cat("야옹이");
        Pet dog = new Dog("멍멍이");
        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
    }
}