package test;

/**
 * Created by arthur on 20/07/2017.
 */
public class SuperInheritance {
    public static void main (String[] args) {
        class Elder {
            Elder() {
                System.out.println("Elderly");
            }
            protected void test() {
                System.out.println("testing from elderly");
            }
        }
        class Parent extends Elder {
            Parent() {
                System.out.println("Parent");
            }
            @Override
            protected void test() {
                super.test();
                System.out.println("testing from parent");
            }
        }
        class Fils extends Parent {
            Fils() {
//                super();
                System.out.println("Fils");
                test();
            }
            @Override
            public void test() {
                super.test();
                System.out.println("testing from child");
            }
        }

        new Fils();
    }

}
