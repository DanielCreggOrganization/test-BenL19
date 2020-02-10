package ie.gmit.lecweek5;

class Human{
    int age;
    double weight;
    String name;

    void printname(){
        System.out.println(name);
    }
    
    int reduceAge(){
        return age--;
    }
}