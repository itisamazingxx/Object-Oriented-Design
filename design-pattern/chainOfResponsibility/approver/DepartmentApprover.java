public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println("Request id " + purchaseRequest.getId() + " was handled by" + this.name);
        } else { // Cannot handle the request, pass to next approver
            approver.processRequest(purchaseRequest);
        }
    }

}
