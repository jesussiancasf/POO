//import java.util.ArrayList;
//import java.util.Map;

class UberVan extends Car {
   // Map<String, Map<String, Integer>> typeCarAccepted;
    //ArrayList<String> material;
    //protected int passengers;

    public UberVan(String license, Account driver
            ) {
        super(license, driver);
       // this.typeCarAccepted = typeCarAccepted;
        //this.material = material;
    }

    @Override
    public void setPassengers(int passengers) {
        if(passengers==6){
            this.passengers = passengers;
         }else{
            System.out.println("Nesesitas asignar 6 pasajeros");
         }
    }

}
