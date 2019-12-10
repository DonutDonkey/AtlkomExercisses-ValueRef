package pl.accenture;

class Dog{
    String name;

    public Dog(String name) { this.name = name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Dog name=" + name;
    }
}

// https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value

public class Main {

    public static void main(String[] args) {
	    Dog myDog = new Dog("Tramp");

	    //Jave is only pass by value, if we pass object to a method, we are passing a
        System.out.println(myDog);
	    changeDogNameByRefTwo(myDog);
        System.out.println(myDog);

        System.out.println("*****");

        System.out.println(myDog);
        changeDogNameByRef(myDog);
        System.out.println(myDog);

        int i = 10;

        System.out.println(i);
        changeByValue(i);
        System.out.println(i);
    }

    //D is new value pointing at memory adress of passed object
    static void changeDogNameByRef(Dog d){
        d.setName("Rover");
    }

    //D is new value with originaly points at adress of passed object until we change it
    static void changeDogNameByRefTwo(Dog d){
        d = new Dog("Ralph");
        d.setName("Wolf");
    }

    static void changeByValue(int i){
        i = i*2;
    }
}
