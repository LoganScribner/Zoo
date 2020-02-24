public class Zoo {

    public static void main(String[] args){
     Tiger tigger = new Tiger("Tigger");
     Bear pooh = new Bear("Pooh" );
     Unicorn bob = new Unicorn("Rarity");
     Giraffe tall = new Giraffe("Gemma");
     Bee sting = new Bee("Stinger");
     Zookeeper z = new Zookeeper("Zoebot");
        tigger.eat("meat");
        pooh.eat("fish");
        bob.eat("marshmallows");
        bob.eat("meat");
        tall.eat("meat");
        tall.eat("leaves");
        sting.eat("ice cream");
        sting.eat("pollen");
        Beast[] animals = {tigger, pooh, bob, tall, sting};
        z.feedAnimals(animals, "meat");
    }






}
