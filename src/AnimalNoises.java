import model.Cat;
import model.Hippo;
import model.Nuthatch;
import model.Pig;
import model.Sheep;
import model.Snake;
import model.Dog;
import model.Ferret;
import model.Fish;
import model.Turkey;
import model.Fox;
import model.Goat;
import model.Monkey;
import model.Bat;
import model.Bear;
import model.Blobfish;
import model.Owl;
import model.Cow;

public class AnimalNoises {
	
	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Cat garfield = new Cat();
		System.out.println(garfield.speak());
		
		Nuthatch noona = new Nuthatch();
		System.out.println(noona.speak());
    
		Dog brian = new Dog();
		System.out.println(brian.speak());
		
		Turkey tom = new Turkey();
		System.out.println(tom.speak());
		
		Fox tod = new Fox();
		System.out.println(tod.speak());
		
		Bat zubat = new Bat();
		System.out.println(zubat.makeNoise());
		
		Bear glass = new Bear();
		System.out.println(glass.makeNoise());

		Snake python = new Snake();
		System.out.println(python.makeNoise());
		
		Goat jeff = new Goat();
		System.out.println(jeff.makeNoise());
		
		Ferret cuddles = new Ferret();
		System.out.println(cuddles.speak());

		Fish craoker = new Fish();
		System.out.println(craoker.makeNoise());

		Blobfish blobby = new Blobfish();
		System.out.println(blobby.makeNoise());
		
		Sheep sheep = new Sheep();
		System.out.println(sheep.makeNoise());
		
		Monkey amp = new Monkey();
		System.out.println(amp.makeNoise());
		
		Hippo hip = new Hippo();
		System.out.println(hip.makeNoise());
		
		Cow theCow = new Cow();
		System.out.println(theCow.makeNoise());

		Pig charlotte = new Pig();
		System.out.println(charlotte.speak());

		Owl soren = new Owl();
		System.out.println(soren.speak());

	}

}
