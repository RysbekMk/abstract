public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(250, 12, "female", "ala");
        Cow cow2 = new Cow(234, 8, "male", "kara");
        Cow cow3 = new Cow(233, 4, "female", "kuron");
        Cow cow4 = new Cow(263, 7, "female", "atyjok");
        Cow cow5 = new Cow(238, 9, "female", "ala-bula");

        Sheep sheep = new Sheep(23, 4, "male", "boika");
        Sheep sheep2 = new Sheep(56, 8, "female", "sary");
        Sheep sheep3 = new Sheep(56, 9, "female", "kara");


        Horse horse = new Horse(123, 5, "male", "Akkula", "ak");
        Horse horse2 = new Horse(145, 8, "male", "Boika", "kuron");
        Horse horse3 = new Horse(239, 14, "male", "Taitoru", "chymkara");

        ;

        Farm farm1 = new Farm("Nookat,Bel-oruk", new Cow[]{cow, cow2, cow3, cow4, cow5},
                new Horse[]{horse, horse2, horse3},
                new Sheep[]{sheep,sheep2,sheep3}, "Malchy");
        System.out.println(farm1);

        Farm farm2 = new Farm("Nookat,Bel-oruk", new Cow[]{cow},
                new Horse[]{horse},
                new Sheep[]{sheep}, "Malchy");
        System.out.println(farm2);



    }
}