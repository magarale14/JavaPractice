/* This program is to learn how to create class, declare attributes, declare method
 * Method String talk has a return
 * Author: Reeta
 * 8/8/18
*/

public class Pet {

    private int age;
    private float weight;
    private float height;
    private String color;

    public void sleep(){
        System.out.println(
                "Good night, see you tomorrow!");
    }

    public void eat(){
        System.out.println(
         "I’m so hungry, let me have a snack like nachos!");
    }

    public String talk(String Word){
        String petResponse = "OK!!" + Word;
        return petResponse;
    }
}
