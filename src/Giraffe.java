public class Giraffe extends Beast{
    public Giraffe(String n){
        super(n, "leaves");
    }

    public void eat(String food){
        if(favoriteFood == food){
            System.out.println(name + " eats " + food);
            System.out.println("YUM!!! " + name + " wants more " + food);
            System.out.println(name + " sleeps for 8 hours");
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }
    }

}
