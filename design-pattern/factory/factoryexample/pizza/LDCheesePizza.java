public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("London cheese pizza");
        System.out.println("preparing for London cheese pizza");
    }
    
}
