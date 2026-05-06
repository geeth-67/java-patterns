package FactoryPattern.Packages;

import FactoryPattern.BridalDeco;
import FactoryPattern.FlowerGirlDeco;
import FactoryPattern.ParentDeco;

public class PlatinumPackage extends Package{

    @Override
    protected void createPackage() {

        deco.add(new BridalDeco());
        deco.add(new FlowerGirlDeco());
        deco.add(new ParentDeco());
    }
}
