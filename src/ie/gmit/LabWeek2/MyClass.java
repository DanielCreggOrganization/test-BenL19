package ie.gmit.LabWeek2;
//declaring class
class MyClass {

//making a method
    static void myMethod() {
            System.out.println("I just got executed!");
        }
//declaring the main method
        public static void main(String[] args) {

//calling the method and looping it 10 times
        for(int i = 1; i<=10;i++){
            myMethod();
        }
    
    }
}