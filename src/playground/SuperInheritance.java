package playground;

/**
 * SuperInheritance
 */
public class SuperInheritance {
    SuperInheritance() {
        Parent darthVader = new Parent();
        Child anakin = new Child();

        darthVader.talk();
        anakin.talk();
    }
}

class Elder {
    Elder() {
        System.out.println("Elderly constructor");
    }

    protected void talk() {
        System.out.println("elder: ~~ feel the dark side of the force ~~");
    }
}

class Parent extends Elder {
    Parent() {
        System.out.println("- Parent constructor");
    }

    @Override
    protected void talk() {
        System.out.println("parent: i am your father");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("-- Child constructor");
    }

    @Override
    public void talk() {
        System.out.println("child: nooooooooooo");
    }
}
