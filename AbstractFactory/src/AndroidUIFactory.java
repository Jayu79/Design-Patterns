import buttons.AndroidButton;
import buttons.Button;
import dropdowns.AndroidDropDown;
import dropdowns.DropDown;
import menus.AndroidMenu;
import menus.Menu;

public class AndroidUIFactory implements UIFactory{

    public AndroidButton CreateButton(){
        return new AndroidButton();
    }

    public AndroidMenu CreateMenu(){
        return new AndroidMenu();
    }

    public AndroidDropDown CreateDropDown(){
        return new AndroidDropDown();
    }

}
