public abstract class SoyMilk {
    // template method, 方法可以做成final，不让子类去覆盖

    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    void select() {
        System.out.println("Step1: choose fresh soy bean");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("Step3: soak three hours");
    }

    void beat() {
        System.out.println("Step4: soy bean");
    }
}
