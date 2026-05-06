package FactoryPattern.Packages;

import FactoryPattern.BridalDeco;

public class BasicPackage extends Package {

    @Override
    protected void createPackage() {

        deco.add(new BridalDeco());
    }
}
