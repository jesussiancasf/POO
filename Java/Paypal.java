class Paypal extends Payment{
    String email;
    Paypal(Integer id, String email) {
        super(id);
        this.email=email;
    }
}
