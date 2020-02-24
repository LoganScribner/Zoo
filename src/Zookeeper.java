public class Zookeeper {
    String name;

    public Zookeeper(String name){
        this.name = name;
    }

    public void feedAnimals(Beast[] animals, String food){
        System.out.println(name + " is feeding " + food + " to " + animals.length + " animals out of " + Beast.population);
        for(int i = 0; i < animals.length; i ++){
            animals[i].eat(food);
        }
    }


}
