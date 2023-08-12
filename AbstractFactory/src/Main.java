import buttons.Button;
import dropdowns.DropDown;
import menus.Menu;

public class Main {
    public static void main(String[] args) {

        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();

        Button button = uiFactory.CreateButton();
        button.changeSize();

        Menu menu = uiFactory.CreateMenu();
        menu.setTheme();

        DropDown dropDown = uiFactory.CreateDropDown();
        dropDown.dropDownType();

    }
}