public class RegularCustomer extends Customer {
    @Override
    public String createMail() {
        return "Dear Regular Customer: Thank you for choosing our service.";
    }
}
