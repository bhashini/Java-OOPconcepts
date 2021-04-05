package com.busyqa.coursework.wk4_answer;


/*
 * Write a Generic Class named AnimalHouse with a generic property of type E
 * called animal. The class must have a getter(), setter() for the property,
 * and a method called printAnimal() that prints the property on the console
 * using System.out.printn().
 *
 * After you complete the class, uncomment the code in the main() method and
 * run the program.
 */

class AnimalHouse<E> {
	 /* Write your solution here. */
	private E Animal;

	
	
	public E getAnimal() {
		return Animal;
	}



	public void setAnimal(E animal) {
		Animal = animal;
	}



	public void printAnimal()
	{
		System.out.println(this.Animal);
	}
   
}

class Animal{

    @Override
    public String toString() {
        return "I am an Animal";
    }
}

class Cat extends Animal {

    @Override
    public String toString() {
        return "I am a Cat";
    }
}

class Dog extends Animal {

    @Override
    public String toString() {
        return "I am a Dog";
    }
}

public class GenericClass {

    public static void main(String[] args) {

        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();

//        Uncomment the code below after the Generic Class is completed.
//
        catHouse.setAnimal(new Cat());
        dogHouse.setAnimal(new Dog());

        catHouse.printAnimal();
        dogHouse.printAnimal();
    }
}
