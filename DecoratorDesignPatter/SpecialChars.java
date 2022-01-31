/**
 * Written by Heidi Duncan
 */
package DecoratorDesignPatter;

public class SpecialChars extends PasswordDecorator{
    //Password passwordBeginning;

    SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
        String newPass = passwordBeginning.password;

        /**
         * The remaing 30% of the alphabet will be converted to special characters. I did do the math
         * just to make sure just in case and since 30% of the alphabet is 7.8 doing 7 letters to convert
         * to the 7 special characters will result in the wanted output (for the most part).
         * 
         * This is what I did since I couldnt get 30% to apply indivisually to each passwords length and 
         * connect that diectly to random characters that come after a letter in the string
         * I was pretty confused on this part to be honest.
         */
        //newPass = newPass.replaceAll(" ", "");

         newPass = newPass.replace("h","*");
         newPass = newPass.replace("n","!");
         newPass = newPass.replace("r","%");
         newPass = newPass.replace("u","+");
         newPass = newPass.replace("v",".");
         newPass = newPass.replace("w","{");
         newPass = newPass.replace("y","{");
         newPass = newPass.replace("z","}");
        
         
    this.password = newPass;
}
    
    
   @Override
    public String getPassword() {
        
        password = password.replaceAll(" ", "");
        return this.password;
        
    }

}
