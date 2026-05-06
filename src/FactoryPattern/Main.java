package FactoryPattern;

import FactoryPattern.Packages.Package;
import FactoryPattern.Packages.PackageCode;
import FactoryPattern.Packages.PackageFactory;

public class Main {

    public static void main(String[] args) {

        PackageFactory packageFactory = new PackageFactory();

        Package basicPackage = packageFactory.createPackage(PackageCode.BASIC);
        Package goldPackage = packageFactory.createPackage(PackageCode.GOLD);
        Package platinumPackage = packageFactory.createPackage(PackageCode.PLATINUM);

        System.out.println(basicPackage);
        System.out.println(goldPackage);
        System.out.println(platinumPackage);
    }
}
