import buttons.Button;
import menus.Menu;
import dropdowns.DropDown;

public interface UIFactory {

    public Button CreateButton();
    public Menu CreateMenu();
    public DropDown CreateDropDown();

}
