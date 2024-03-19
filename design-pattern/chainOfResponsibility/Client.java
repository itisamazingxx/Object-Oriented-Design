public class Client {

    public static void main(String[] args) {
        PurchaseRequest purchase = new PurchaseRequest(1, 1000, 1);

        // Creates related approver
        DepartmentApprover departmentApprover = new DepartmentApprover("Zhang");
        CollegeApprover collegeApprover = new CollegeApprover("Tong");
        VicePresidentApprover vicePresidentApprover = new VicePresidentApprover("Dong");
        PresidentApprover presidentApprover = new PresidentApprover("Chen");

        // 需要将各个处理人构成一个环形

        departmentApprover.processRequest(purchase);

    }
    
}
