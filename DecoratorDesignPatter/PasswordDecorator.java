/**
 * Written by Heidi Duncan
 */

package DecoratorDesignPatter;

public abstract class PasswordDecorator extends Password {
    
    Password passwordBeginning;

    PasswordDecorator(Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
    }

    public abstract String getPassword();

}
