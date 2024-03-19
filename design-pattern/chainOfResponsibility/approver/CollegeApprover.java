public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("Request id " + purchaseRequest.getId() + " was handled by" + this.name);
        } else { // Cannot handle the request, pass to next approver
            approver.processRequest(purchaseRequest);
        }
    }
    
}
