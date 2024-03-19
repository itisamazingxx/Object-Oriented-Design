import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a composite of combination design pattern
 */

public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    public void print() {
        System.out.println("University Info: \n");
        System.out.println("---" + this.getName() + "---");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
    
}
