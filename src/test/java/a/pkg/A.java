package a.pkg;

public class A extends AParent implements AInterface {
    private int aField;

    public void aMethod() {
    }

    public void aOverloaded() {
    }

    public void aOverloaded(int arg) {
    }

    public void aOverloaded(boolean arg) {
    }

    public void commonOverloaded(Object arg) {
    }

    public void commonOverloaded(A arg) {
    }

    @Override
    public void aInterfaceMethod() {
    }

    public class Inner {
        private int aField;
    }
}
