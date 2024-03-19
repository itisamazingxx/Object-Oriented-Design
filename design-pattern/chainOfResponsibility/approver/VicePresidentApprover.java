public class VicePresidentApprover extends Approver {
    public VicePresidentApprover(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 30000) {
            System.out.println("Request id " + purchaseRequest.getId() + " was handled by" + this.name);
        } else { // Cannot handle the request, pass to next approver
            approver.processRequest(purchaseRequest);
        }
    }
}