import buttons.IOSButton;
import dropdowns.IOSDropDown;
import menus.IOSMenu;

public class IOSUIFactory implements UIFactory{

    public IOSButton CreateButton(){
        return new IOSButton();
    }

    public IOSMenu CreateMenu(){
        return new IOSMenu();
    }

    public IOSDropDown CreateDropDown(){
        return new IOSDropDown();
    }
}
