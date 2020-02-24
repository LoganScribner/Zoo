public class Beast {
    String name;
    String favoriteFood;

    public Beast(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
        population ++;
    }


    static int population = 0;

    public void sleep() {
        // complete your sleep function here, noting the change from global to properties
        System.out.println(name + " sleeps for 8 hours");

    }

    // complete your eat function here!
    public void eat(String food){
        System.out.println(name+" eats "+ food);
        if(favoriteFood == food){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep();
        }
    }

}
