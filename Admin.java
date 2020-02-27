import java.util.ArrayList;

public class Admin{

    public ArrayList<GraphicObject> listElements; //declaration

    public Admin(){
        listElements = new ArrrayList<GraphicObject>(); //creating

        listElements.add(new Zombie("Herman"));
        listElements.add(new GreenBallon("Green1"));
        listElements.add(new Zombie("German"));
        listElements.add(new GreenBallon("Green2"));
        listElements.add(new Zombie("Peter"));
        listElements.add(new SilverBallon("Silver1"));
        listElements.add(new SilverBallon("Silver2"));

        TimerTask timertask = new Timer(){

            public void run(){
                moveFigures():
            }
        }

        public void moveFigures(){

            for(GraphicObject) go: listElements)
            {
                go.move();
                System.out.println("--------");
            }

            public static void main(String args[]) {
                
            }
        }
    }
