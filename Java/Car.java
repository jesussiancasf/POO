class Car {
   private int id;
   private String license;
   private Account driver;
   protected int passengers; 

   public Car(String license, Account driver){
      this.license=license;
      this.driver=driver;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getLicense() {
      return license;
   }

   public void setLicense(String license) {
      this.license = license;
   }

   public Account getDriver() {
      return driver;
   }

   public void setDriver(Account driver) {
      this.driver = driver;
   }

   public int getPassengers() {

      return passengers;
   }

   public void setPassengers(int passengers) {
      if(passengers==4){
         this.passengers = passengers;
      }else{
         System.out.println("Nesesitas asignar solo hasta 4 pasajeros");
      }
   }

   void printDataCar(){
      System.out.println("License "+this.license+ " passenger: "+this.passengers);
   }


}
