import model.Cat;
import model.Nuthatch;
import model.Dog;
import model.Turkey;
import model.Fox;
import model.Bat;
import model.Bear;
//Why aren't we just using import model.*?

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
		
		// 3 instance variables
		Bear glass = new Bear("Asian Black Bear", 298, "thibetanus");
		System.out.println(glass.makeNoise());
		Bear gelato = new Bear("American Black Bear", 176, "americanus");
		System.out.println(gelato.makeNoise());
		Bear rohto = new Bear("Polar Bear", 570, "maritimus");
		System.out.println(rohto.makeNoise());
	}

}
