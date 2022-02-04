package HomeWorks;

public class Main {

    public static void main(String[] args) {

        Fish salmon = new Fish();
        salmon.setName("Salmon");
        salmon.setPredatory(true);
        salmon.setColor("Light pink");

        Fish perch = new Fish();
        perch.setName("Perch");
        perch.setPredatory(true);
        perch.setColor("Greenish");

        System.out.println(perch.fishInfo()+'\n'+salmon.fishInfo());

        Parrot vovka = new Parrot();
        vovka.setName("Vovka");
        vovka.setBreed("Conures");
        vovka.setColor("Green-Cheeked");
        vovka.setLifespan((byte)0);

        Parrot tasha = new Parrot();
        tasha.setName("Tasha");
        tasha.setBreed("Amazon");
        tasha.setLifespan((byte)50);
        tasha.setColor("Green");

        System.out.println(vovka.parrotInfo()+'\n'+tasha.parrotInfo());

        Cat kuzya = new Cat();
        kuzya.setName("Kuzya");
        kuzya.setBreed("Abyssinian");
        kuzya.setAge((byte)5);
        kuzya.setColor("Ruddy");

        Cat murka = new Cat();
        murka.setName("Murka");
        murka.setBreed("American Bobtail");
        murka.setAge((byte)3);
        murka.setColor("Grey");

        System.out.println(kuzya.catInfo()+'\n'+murka.catInfo());

        Dog sharik = new Dog();
        sharik.setName("Sharik");
        sharik.setBreed("Alabay");
        sharik.setAge((byte)4);
        sharik.setColor("Grey");

        Dog okjetpes = new Dog();
        okjetpes.setName("Okjetpes");
        okjetpes.setBreed("Taigan");
        okjetpes.setAge((byte)5);
        okjetpes.setColor("Black");

        System.out.println(sharik.dogInfo()+'\n'+okjetpes.dogInfo());


    }
}
