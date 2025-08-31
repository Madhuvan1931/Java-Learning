public class OOPS {
    public static void main(String[] args) {
        { // Object creation and class 
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // // System.out.println(p1.color);
        // p1.setTip(4);
        // // System.out.println(p1.tip);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());
        }

        {// Access Specifiers Example
            // BankAccount myAcc = new BankAccount();
            // myAcc.username = "Madhuvna Singh";
            // myAcc.setPassword("fihffrbj");
        }

        {// Constructor Calling 
            // Student s1 = new Student();
            // Student s2 = new Student("Madhuvan Singh");
            // Student s3 = new Student(193147399);
            // s1.Main();
            // System.out.println(s2.name);
            // System.out.println(s3.roll);
        }

        {//Copy constructor details
            // Student s1 = new Student();
            // s1.name = "Madhuvan Singh";
            // s1.roll = 134;
            // s1.marks[0] = 80;
            // s1.marks[1] = 70;
            // s1.marks[2] = 60;
            // for(int i=0; i<3; i++){
            //     System.out.println(s1.marks[i]);
            // } 
            // Student s2 = new Student(s1);
            // System.out.println(s1.name);
            // s1.marks[2] = 100;
            // for(int i=0; i<3; i++){
            //     System.out.println(s2.marks[i]);
            // }   
        }
   
        {// Inheritance
            // Fish shark = new Fish();
            // shark.eat();
            // shark.swim();
            // shark.breath();
            // Dog dobby = new Dog();
            // dobby.eat();
            // dobby.legs = 4;
            // System.out.println(dobby.legs);
        }
   
    {// Compile Time Polymorphism-Method Overloading
        // Calculator calc = new Calculator();
        // System.out.println(calc.Sum(3,5));
        // System.out.println(calc.Sum((float)3.3,(float)5.5));
        // System.out.println(calc.Sum(3,5,6));
    }

    {// Compile Time Polymorphism-Method Overriding
        // Animal1 d = new Dear();
        // Animal1 ani = new Animal1();
        // Dear a = new Dear();
        // d.eat();
        // a.eat();
        // ani.eat();
    }

    {//Abstarct class
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // Mustang mus = new Mustang();
    }

    {//Interfaces
        // Queen q = new Queen();
        // q.moves();
        // Bear b = new Bear();
        // b.Grass();
        // b.Meet();
    }

    {//Static Keyword
        // Student1 s1 = new Student1();
        // s1.schoolName = "JMV";

        // Student1 s2 = new Student1();
        // System.out.println(s2.schoolName);

        // Student1 s3 = new Student1();
        // s3.schoolName = "ABC";
        // System.out.println(s1.schoolName);

        // System.out.println(s2.returnPercentage(34,56,78));
    }

    {//Super Keyword
        // Horse3 h = new Horse3();
        // System.out.println(h.color);
    }

    {//Constructor Chaining
        Student3 s1 = new Student3();           // calls constructor 1 → then constructor 2
        Student3 s2 = new Student3("Ram", 18);  // directly calls constructor 2    
    }
}
}

class Pen {
    private String color;
    private int tip;
    // Setters
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    // Getters
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}

// Access Specifiers Example
class BankAccount{
   public String username;
   private String password;
   
   public void setPassword(String pwd){
    password = pwd;
   }
}

// Constructors
class Student{
    String name;
    int roll;
    String password;
    int marks[];

     Student(){
        marks = new int[3];
        System.out.println("Constructor is called");
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
   void Main(){
        System.out.println("Hello");
    }
    // shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.roll = s1.roll;
    //     this.name = s1.name;
    //     this.marks = s1.marks;
    // }

    // Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.roll = s1.roll;
        this.name = s1.name;
        for(int i=0;i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}

// Inheritance
class Animal{ // base class
    String color;
    void eat(){
        System.out.println("Eats");
    } 
    void breath(){
        System.out.println("Breath");
    }
}
// Derived class
class Fish extends Animal{
    int fins;
    void swim() {
        System.out.println("Swim in water");
    }
}
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Tuna extends Fish{
    void price(){
        System.out.println("Tuna is expensive fish");
    }
}

class Shark extends Fish{
    void price(){
        System.out.println("Shark is dengerous fish");
    }
}

class Peacock extends Bird{
    void National(){
        System.out.println("Peacock is a National Bird ");
    }
}

class Parrot extends Bird{
    void voice(){
        System.out.println("Parrot");
    }
}
class Dog extends Mammal{
    String breath;
}

class Cat extends Mammal{
    void jump(){
        System.out.println("Cat can jump");
    }
}

class Human extends Mammal{
    void Cooke(){
        System.out.println("Human can cooke food");
    }
}

// Polymorphism
// Compile Time Polymorphism-Method Overloading
class Calculator {
    int Sum(int a, int b){
        return a+b;
    }
    float Sum(float a, float b){
        return a+b;
    }
    int Sum(int a, int b, int c){
        return a+b+c;
    }
}

// Compile Time Polymorphism-Method Overriding
class Animal1{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Dear extends Animal1{
    void eat(){
        System.out.println("Eats Grass");
    }
}

// Abstration
// Abstract class
abstract class Animal2{
    String color;
    Animal2(){
        System.out.println("Animal Constructor called");
        color = "Brown";
    }
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}
class Horse extends Animal2 {
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changeColor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken  extends Animal2{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
}

// Interfaces
interface ChessPlayer {
            void moves();
}
class Queen implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down Left, Right, Diagonal (in all 4 directions)");
    }
}
class Rook implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down Left, Right, ");
    }
}
class King implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down Left, Right, Diagonal - (by 1 step)");
    }
}

// Multiple Inheritance by Interfaces
interface Herbivore{
    void Grass();
}
interface Carnivore{
    void Meet();
}
class Bear implements Herbivore,Carnivore{
    public void Grass(){
        System.out.println("Eats Grass ");
    }
    public void Meet(){
        System.out.println("Eats Meet ");
    }
}

// Static Keyword
class Student1 {
    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
   static int returnPercentage(int math, int phy, int chem){
        return(math+chem+phy);
    }
}

// Super Keyword 
class Animal3 {
    String color;
    Animal3(){
        System.out.println("Animal Constructor is called ");
    }
}
class Horse3 extends Animal3{
    Horse3(){
        super.color = "Blue";
        System.out.println("Horse constructor is called");
    }
}

// Constructor Chaining
class Student3 {
    String name;
    int age;

    // Constructor 1
    Student3() {
        this("Unknown", 0); // calling constructor 2
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Student3(String n, int a) {
        this.name = n;
        this.age = a;
        System.out.println("Parameterized constructor called");
    }
}
