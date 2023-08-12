public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatforms(SupportedPlatforms platform){
        return switch (platform){
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
