package ie.gmit.lecweek5;

class Main{
    public static void main(String[] args) {
        Human HumanObject1 = new Human();
        Human HumanObject2 = new Human();

        HumanObject1.age = 20;
        HumanObject1.weight = 12.3;
        HumanObject1.name = "Ben";
        HumanObject1.printname();

        System.out.println("His name is "+HumanObject1.name);
        System.out.println("He is "+HumanObject1.age+" years old");
        System.out.println("He weighs "+HumanObject1.weight+"kg");
        
        System.out.println();

        HumanObject2.age = 25;
        HumanObject2.weight = 11.2;
        HumanObject2.name = "John";
        HumanObject2.printname();

        System.out.println("His name is "+HumanObject2.name);
        System.out.println("He is "+HumanObject2.age+" years old");
        System.out.println("He weighs "+HumanObject2.weight+"kg");

        System.out.println();

        HumanObject2.name = "Tom";
        HumanObject2.printname();

        System.out.println();

        HumanObject2.reduceAge();
        System.out.println("He is "+HumanObject2.age+" years old");
    }
}