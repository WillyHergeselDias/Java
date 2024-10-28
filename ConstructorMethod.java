public class ConstructorMethod{

 public static void main(String[] args){
  Cat kitty = new Cat("Fluffball",2);
  System.out.println(kitty.name);
  System.out.println(kitty.age);
 }
}

class Cat{
  String name;
  int age;

 public Cat(String name, int age){
  this.name = name;
  this.age = age;
 }
}
