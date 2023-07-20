// OOP Lab Assignment
// Inheritance And Polymorphism
// Each class will override the toString method()
abstract class SuperHero{ //abstract class created
String heroname;
String realname;
String occupation;
String gender;
String descritption;
int age;
boolean canfly;
SuperHero(){} //parameterless constructor
SuperHero (String v,String w, String x, String y, String z, int num, boolean ans){ 
heroname = v;
realname = w;
occupation = x;
gender = y;
descritption= z;
age = num;
canfly = ans;
}
abstract void Attack (String attack_name); //abstract methods of SuperHero Class defined 
abstract void Rest (int rest_time);
} //abstract class SuperHero closed
class PhysicalHero extends SuperHero { //Subclass 01
String attack_name;
int strength;
PhysicalHero(){ //parameterless constructor
heroname = "FuegoMan";
realname = "Peter Park";
occupation = "College Student";
gender = "Male";
descritption= "Peter Park - known as Pete - like most teenagers, is a college student. He can fly and produce fire by his hands. \nHe also has incredible strength, agility, eye-scan technology, and the ability to cling to walls. He has night vision too." ;
age = 20;
canfly = true;
strength = 1000 ;
}
PhysicalHero (String v,String w, String x, String y, String z, int num, 
boolean ans, int power){
super (v,w,x,y,z,num,ans);
strength = power;
}
void Attack (String fight) {
attack_name = fight;
strength -= 15;
System.out.println();
System.out.print(heroname + " used "+ attack_name + "!");
System.out.print("\nStrength Decreased!");
System.out.print("\nPhysical Strength: "+ strength);
System.out.println();
}
void Rest (int resttime) {
strength += 20;
}
public String toString () {
return ("Hero Name: " + heroname+ "\nReal Name: "+ realname + "\nOccupation: "+ occupation+ "\nGender: "+ gender+ "\nDescription: "+ descritption + "\nAge: "+ age+ "\nFlight: "+ canfly+ "\nPhysical Strength: "+ strength +" % of normal human form.");
}
} //Subclass 01 closed
class MageHero extends SuperHero{ //Subclass 02
String attack_name;
int mana_capacity;
MageHero() //parameterless constructor
{
heroname = "Athena";
realname = "Elizabeth McRay";
occupation = "Journalist";
gender = "Female";
descritption= "Elizabeth McRay is an journalist. She has her connetions to find the truth. \nShe has magical powers. She can read minds. Her eyes can heal. \nThough she is kind, caring, and smart, her baseball bat can tame many bad people.";
age = 34;
canfly = true;
mana_capacity = 560 ;
 }
MageHero (String v,String w, String x, String y, String z, int num, boolean
ans, int power){
super (v,w,x,y,z,num,ans);
mana_capacity = power;
}
void Attack (String fight) {
attack_name = fight;
mana_capacity -= 15;
System.out.print(heroname + " used "+ attack_name + "!");
System.out.print("\nMana Capacity Decreased!");
System.out.print("\nMana Capacity: " + mana_capacity);
System.out.println();
}
void Rest (int resttime) {
mana_capacity += 20;
}
public String toString () {
return ("Hero Name: " + heroname+ "\nReal Name: "+ realname + "\nOccupation: "+ occupation+ "\nGender: "+ gender+ "\nDescription: "+ descritption + "\nAge: "+ age+ "\nFlight: "+ canfly+ "\nMana Capacity: "+ mana_capacity +" magika units.");
}
} //Subclass 02 closed
class Vigilante extends SuperHero { //Subclass 03
String primaryweapon;
String attack_name;
int strength;
Vigilante (){ //parameterless constructor
heroname = "Spy-Man";
realname = "Alexei Ronov";
occupation = "American Wealthy Playboy";
gender = "Male";
descritption= "Alexei Ronov is an undocover spy agent. He designed one of the most dealiest of weapons - a hologram. \nHe is a philanthropist who vows to wipe out bad people. ";
age = 31;
canfly = false;
strength = 975;
primaryweapon = "AlexSee" ;
}
Vigilante(String v,String w, String x, String y, String z, int
num, boolean ans, int power, String weapon){
super (v,w,x,y,z,num,ans);
strength = power;
primaryweapon = weapon;
}
void Attack (String fight) {
attack_name = fight;
strength -=15;
System.out.print(heroname + " used "+ attack_name + "!");
System.out.println();
}
void Rest (int resttime) {
strength += 20;
}
public String toString () {
return ("Hero Name: " + heroname+ "\nReal Name: "+ realname + "\nOccupation: "+ occupation+ "\nGender: "+ gender+ "\nDescription: "+ descritption + "\nAge: "+ age+ "\nFlight: "+ canfly + "\nPhysical Strength: "+ strength+ " of normal human form."+ "\nWeapon: "+ primaryweapon + ".");
}
} //Subclass 03 closed
 class Speedster extends PhysicalHero{ //Speedster inherits from PhysicalHero
 int calorie;
 int sp;
 Speedster(){ 
heroname = "PsychFolk";
realname = "Dr. Harleen Quinzel";
occupation = "Psychologist";
gender = "Female";
descritption= "Dr. Harleen Quinzel has an experience with many psychos. She has her ways to help the patients. \nWith her super speed powers, she can capture anyone.";
age = 27;
canfly = false;
strength = 450 ;
sp = 2000;
calorie = 456;
 }
 Speedster (String v,String w, String x, String y, String z, int
num, boolean ans, int power, int speed, int calorie_intake){
 super ();
sp = speed;
calorie = calorie_intake;
 }
void Attack (String fight) {
attack_name = fight;
strength -=15;
System.out.println();
System.out.print(heroname + " used "+ attack_name + "!");
System.out.print("\nStrength Decreased!");
System.out.print("\nPhysical Strength: "+ strength);
System.out.println();
}
void Rest (int resttime) {
strength += 20;
}
public String toString () { 
return ("Hero Name: " + heroname+ "\nReal Name: "+ realname + "\nOccupation: "+ occupation+ "\nGender: "+ gender+ "\nDescription: "+ descritption + "\nAge: "+ age+ "\nFlight: "+ canfly+ "\nPhysical Strength: "+ strength +" % of normal human form."+ "\nTop Speed: "+ sp + " km/h"+ "\nDaily Calorie Intake: "+ calorie + " kcal");
}
 } //Speedster class closed
class super_hero { //main class
public static void main(String[] args) {
PhysicalHero a = new PhysicalHero(); //creating objects for each class and printing
System.out.println(a); 
System.out.println();
PhysicalHero a1 = new PhysicalHero("Peralta", "Clark Hudson", "Broker", "Male", "Clark Hudson is a man with extraordinary abilities. \nHe can manipulate people and that is why he's a good broker. He can use his fists too for making people comply by his wishes.",34, false, 800);
System.out.println(a1);
System.out.println();
MageHero a2 = new MageHero();
System.out.println(a2);
System.out.println();
Vigilante a3 = new Vigilante();
System.out.println(a3);
System.out.println();
Speedster b = new Speedster();
System.out.println(b);
System.out.println();
System.out.println("ATTACK"); 
a.Attack("fireball");
System.out.println();
a.Rest(20);
System.out.println(a);
a1.Attack("punch");
System.out.println();
a1.Rest(20);
System.out.println(a1);
b.Attack("her baseball bat");
System.out.println();
b.Rest(20);
System.out.println(b);
System.out.println();
a3.Attack("AlexSee");
System.out.println();
a2.Attack("telepathy");
System.out.println();
a2.Rest(20); 
System.out.println(a2);
} //main class closed
} //End of Program
