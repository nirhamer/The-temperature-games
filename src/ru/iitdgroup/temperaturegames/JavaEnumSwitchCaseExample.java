package ru.iitdgroup.temperaturegames;
public class JavaEnumSwitchCaseExample {

    enum alignment {
        LEFT, RIGHT, CENTER, JUSTIFY
    }

    public static void main(String[] args) {
        alignment L = alignment.JUSTIFY;
        switch(L)
        {
            case LEFT:
                System.out.println("left alignment");
                break;


            case RIGHT:
                System.out.println("RIGHT alignment");
                break;


            case CENTER:
                System.out.println("center alignment");
                break;

            default:
                //System.out.println("i don't know");
                throw new IllegalArgumentException("Unknown alignment "+L);


        }
    }
}