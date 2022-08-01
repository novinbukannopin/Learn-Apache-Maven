package novin.ardian.yee.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Gson gson = new Gson();
//        Person person = new Person("Novin Ardian Yulianto");
//        String json = gson.toJson(person);
//
//        System.out.println(json);

        String user = "oooxxx";
        char[] arrayChar = user.toCharArray();
        int xInt = 0;
        int oInt = 0;
        for (int i = 0; i < user.length(); i++) {
//      user.length() => 6
//      arrayChar.length => 6
//            x,o,x,o,x,o
//            sout(arrayChar[i])
            if (arrayChar[i] == 'x') {
                xInt++;
            }
            if (arrayChar[i] == 'o') {
                oInt++;
            }
        }
        if (xInt == oInt) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

//
}
