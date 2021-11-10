package Factory.interfaces;

import Factory.model.Hamburger;

public abstract class HamburgerStore {
    public HamburgerStore() {
    }

    public Hamburger orderHamburger(String type) {
        Hamburger burger = this.createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    public abstract Hamburger createHamburger(String var1);
}
