/**
 * @author Heidi Duncan
 */
package StateDesign;
/**
 * Interface that is implemented within the language state classes and can set and which to
 * the respective one when initiated.
 */
public interface State {
    public void pressStarButton();
    public void pressHappyButton();
    public void pressEnglishButton();
    public void pressFrenchButton();
    public void pressSpanishButton();
}
