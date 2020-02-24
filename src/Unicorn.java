public class Unicorn extends Beast {
    public Unicorn(String n){
        super(n, "marshmallows");
    }

    public void sleep(){
        System.out.println(name + " sleeps on a cloud");
    }

    public void eat(String food){
        System.out.println(name+" eats "+ food);
        if(favoriteFood == food){
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep();
        }else{
            sleep();
        }
    }
}
