package FactoryPattern.Packages;

import FactoryPattern.BridalDeco;
import FactoryPattern.FlowerGirlDeco;

public class GoldPackage extends Package{

    @Override
    protected void createPackage() {

        deco.add(new BridalDeco());
        deco.add(new FlowerGirlDeco());
    }
}
