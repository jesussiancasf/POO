class Main {
    public static void main(String[] args) {
       UberVan uberVan=new UberVan("ABC12", new Account(1, "JEssùs", "72855", "as@gmail.cpo", "password"));
       uberVan.setPassengers(6);
       System.out.println(uberVan.getPassengers());
       uberVan.printDataCar();
    }
}
