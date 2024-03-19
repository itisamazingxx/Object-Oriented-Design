import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {


    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void print() {
        System.out.println(this.getName());
    }
    
}
