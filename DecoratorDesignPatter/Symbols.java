/**
 * Written by Heidi Duncan
 */
package DecoratorDesignPatter;

public class Symbols extends PasswordDecorator{

    //Password passwordBeginning;
    public Symbols(Password passwordBeginning)
    {
        super(passwordBeginning);
       
    }
    @Override
    public String getPassword() {
       String newPass = passwordBeginning.password;
       this.password = newPass;  
     
       newPass = newPass.replaceAll(" ", "");
           newPass =  newPass.replace("a","@");
           newPass = newPass.replace("b","8");
           newPass = newPass.replace("e","3");
           newPass = newPass.replace("g","9");
           newPass = newPass.replace("i","!");
           newPass = newPass.replace("o","0");
           newPass = newPass.replace("s","$");
           newPass = newPass.replace("t","7");

        return newPass;
    }

}
