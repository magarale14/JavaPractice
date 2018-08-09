/* This program is to learn how to create object and call a method from class Pet
 *  * Author: Reeta
 * 8/8/18
*/

public class Petmaster {

    public static void main(String[] args) {
    	
    	String petReaction;      
        Pet myPet = new Pet();   

        myPet.eat();             

        petReaction = myPet.talk("Tweet!! Tweet!!"); 

        System.out.println(petReaction);  

        myPet.sleep();        
    }
}