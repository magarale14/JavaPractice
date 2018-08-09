public class FishMaster {

  public static void main(String[] args) {

    Fish myFish = new Fish();

    myFish.dive(2);
    myFish.dive(3);

    myFish.sleep();
  }
}

/* int currentDepth=0;

public int dive(int howDeep){

 currentDepth=currentDepth + howDeep;
 System.out.println("Diving for " +
                  howDeep + " feet");
 System.out.println("I'm at " + currentDepth +
                    " feet below sea level");

 return currentDepth; */
