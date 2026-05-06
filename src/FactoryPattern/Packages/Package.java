package FactoryPattern.Packages;

import FactoryPattern.Decoration;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {

    protected List<Decoration> deco = new ArrayList<>();

    public Package() {
        createPackage();
    }

    protected abstract void createPackage();
}