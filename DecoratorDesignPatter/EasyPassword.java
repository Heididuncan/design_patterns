/**
 * Written by Heidi Duncan
 */

package DecoratorDesignPatter;

import java.util.Random;


public class EasyPassword extends Password{

    public EasyPassword(String phrase)
    {
        Random num = new Random();
        int range = 99;
        int randNum = num.nextInt(range);
        phrase = phrase.replaceAll(" ", "");
        this.password = phrase+randNum;
       
    }

    public String getPassword(String password)
    {
        //password = password.replaceAll(" ", "");
        return this.password;
    }
}
