import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class House {
    int x;
    int y;
    int z;


    public static void main(String[] args) {
        String s = "sdfs.sdfdf!ssdf,df,sdfdfs.";
        int b = s.length();
        int i = s.replaceAll("[.,!]","").length();
        System.out.println("i=" + (b-i));
    }

}
