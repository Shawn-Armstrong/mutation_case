package myjavaproject2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Toto {
    private String name = "Toto";

    public Toto(){}

    public String getName() {
        return name;
    }

     public enum TOYS {
         BALL("his_ball"),
         MONKEY("his_monkey");

         private static final String[] toys = Stream.of(TOYS.values()).map(TOYS::getLink).toArray(String[]::new);
         private String toy;

         TOYS(String theToy) {
             this.toy = theToy;
         }

         public String getLink() {
             return toy;
         }

         public static String[] getLinks() {
             return Arrays.stream(toys).toArray(String[]::new);
         }
     }
}
