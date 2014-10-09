/**
 * Created by Ryan on 9/18/2014.
 */

 enum Sex{MALE, FEMALE}

 class Olympian {
    String name;
    Sex sex;
    int age;

     Olympian(String name, Sex sex, int age){
         this.name = name;
         this.sex = sex;
         this.age = age;
     }//..,

}// end Olympian

class OlympianManager {

//   Sex.MALE    Sex.FEMALE
    private Olympian olympian[] = new Olympian[]{
            new Olympian("Chuck",Sex.MALE,28),
            new Olympian("Bryce",Sex.MALE,16),
            new Olympian("Mindy",Sex.FEMALE,22),
            new Olympian("Ryan",Sex.MALE,22),
            new Olympian("Ava",Sex.FEMALE,9),
            new Olympian("Nick",Sex.MALE,9),
            new Olympian("Cindy",Sex.FEMALE,25),
            new Olympian("Jack",Sex.MALE,11),
            new Olympian("Dilini",Sex.FEMALE,21),
            new Olympian("Troy",Sex.MALE,23),
            new Olympian("Natalie",Sex.FEMALE,23),
            new Olympian("Blake",Sex.MALE,22),
            new Olympian("Lindy",Sex.FEMALE,21),
            new Olympian("Vin",Sex.MALE,23),
            new Olympian("Cassie",Sex.FEMALE,22),
    };

    public Olympian[] getOlympians(){
        return  olympian;
    }//..

}// end OlympianManager


abstract class Event{

    String name;
    int playTo;
    boolean isPlayToExact;
    int playDistance;

    public abstract String getExtraInfo();

}// end Event


class CanJamEvent extends Event{

  int frisbeeSize;

    CanJamEvent(){
        name = "CanJam";
    }

    public String getExtraInfo(){
        return null;
    }


}// end CanJamEvent


class CornHoleEvent extends Event{

   int numBeanBags;

    CornHoleEvent(){
        name = "CornHole";
    }

    public String getExtraInfo(){
        return null;
    }


}// end CornHoleEvent


class HorseShoesEvent extends Event{

   int numHorseShoes;

    HorseShoesEvent(){
        name = "HorseShoes";
    }

    public String getExtraInfo(){
        return null;
    }


}// end HorseShoesEvent


class LadderBallEvent extends Event {

    int numRungs;

     LadderBallEvent() { name = "LadderBall"; }


    public String getExtraInfo() {
        return null;
    }


}// end LadderBallEvent


class StickGameEvent extends Event{

  int frisbeeSize;

    StickGameEvent() { name = "StickGame"; }

    public String getExtraInfo() {
        return null;
    }

}// end StickGameEvent



class WashoosEvent extends Event{

   boolean hasAutoWinStick;
   int numWashoos;

    WashoosEvent(){
        name = "Washoos";
    }

    public String getExtraInfo(){
        return "";
    }

}// end WashoosEvent


class EventManager{

    private Event event[] = new Event[]{
            new CanJamEvent(),
            new CornHoleEvent(),
            new HorseShoesEvent(),
            new LadderBallEvent(),
            new StickGameEvent(),
            new WashoosEvent()
    };

    public Event[] getEvent() {
        return event;
    }
}// end EventManager

public class LGO_Main {

    private static EventManager em;
    private static OlympianManager om;

    public static void showOlympians(){

        Olympian olympian[] = om.getOlympians();

        System.out.println("******* Olympians ********\n");
        for(int i = 0; i < olympian.length; i++){
                System.out.println(olympian[i].name+" "+olympian[i].sex+" "+olympian[i].age);
        }

    }//...

    public static void showEvents() {

        Event event[] = em.getEvent();

        System.out.println("******* Events *******");
        for(int i =0; i < event.length; i++){
            System.out.println(event[i].name+"\n");
        }
    }//..

    public static void showHelp(){

        System.out.println("******** LGO HELP ******\n*");
        System.out.println("* Arguments  -- argument details");
        System.out.println("* events e --list day\'s events.");
        System.out.println("* olympians o --list day\'s olympians.");
        System.out.println("* help h --display this help message");
        System.out.println("*\n*************************************");

    }//..

    public static void init(){

       em = new EventManager();
       om = new OlympianManager();
    }//..

    public static void main(String[] args) {

        System.out.println("******* LGO ********\n");

        init();

        if (args.length > 0) {// checks for initial argument
            String arg = args[0].toLowerCase();
            if (arg.equals("e") || arg.equals("events")) {
                showEvents();
            } else if (arg.equals("o") || arg.equals("olympians")) {
                showOlympians();
            } else  if (arg.equals("h") || arg.equals("help")){
                showHelp();
            }
        } else {// if no initial argument+
            showHelp();
        }
    }//..
}//end class LGO_Main
