public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("NEU", "Boston");

        OrganizationComponent seattleCampus = new College("NEU-seattle", "Seattle");
        seattleCampus.add(new Department("Khoury", "CS-align"));

        university.add((seattleCampus));
        university.print();
    }
    
}
