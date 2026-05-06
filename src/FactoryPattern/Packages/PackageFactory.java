package FactoryPattern.Packages;

public class PackageFactory {

    public Package createPackage(PackageCode code) {

        return switch (code) {

            case BASIC -> new BasicPackage();
            case GOLD -> new GoldPackage();
            case PLATINUM -> new PlatinumPackage();

            default -> throw new IllegalArgumentException("Invalid code");
        };
    }
}
