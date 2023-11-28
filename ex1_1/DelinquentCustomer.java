public class DelinquentCustomer extends Customer {
    @Override
    public String createMail() {
        return "Dear Delinquent Customer: Please settle your outstanding payment promptly.";
    }
}