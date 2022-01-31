/**
 * Written by Heidi Duncan
 */
package DecoratorDesignPatter;

public class RandomCasing extends PasswordDecorator{
    Password passwordBeginning;

    

    public RandomCasing(Password passwordBeginning) {
       
        super(passwordBeginning);
        String newPass = passwordBeginning.password;
        
        newPass = newPass.replaceAll(" ", "");

        newPass =  newPass.replace("a","@");
        newPass = newPass.replace("b","8");
        newPass = newPass.replace("e","3");
        newPass = newPass.replace("g","9");
        newPass = newPass.replace("i","!");
        newPass = newPass.replace("o","0");
        newPass = newPass.replace("s","$");
        newPass = newPass.replace("t","7");
        
        newPass = newPass.replace("c","C");
        newPass = newPass.replace("j","J");
        newPass = newPass.replace("k","K");
        newPass = newPass.replace("f","F");
        newPass = newPass.replace("l","L");
        newPass = newPass.replace("d","D");
        newPass = newPass.replace("m","M");
        newPass = newPass.replace("x","X");
        newPass = newPass.replace("p","P");
        newPass = newPass.replace("q","Q");

        /** 
         Right here is where I tried to do a for loop in order to make a certain number of letters capital
         but logically this didnt work so I figured if I take a whats above of whats left after the symbols
         then it will equal to about 50% of whatever the input is.
         
        for(int i = 0; i < newPass.length();i++ )
        {
            
            newPass.toUpperCase();
        }       
        
        */
        this.password = newPass;
        newPass = password;


    }
    

    @Override
    public String getPassword() {
        
       password = password.replaceAll(" ", "");
        return password;
    }

}
