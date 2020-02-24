public class Bee extends Beast {
    public Bee(String n){
        super(n, "pollen");
    }

    public void eat(String food){
        if(favoriteFood == food){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
            System.out.println(name + " never sleeps");
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
