import java.util.Date;

class CredirCard extends Payment{
    String credirCarNumber;
    Date exDate;
    Integer ccv;
    CredirCard(Integer id, String credirCarNumber, Date exDate,Integer ccv) {
        super(id);
        this.credirCarNumber=credirCarNumber;
        this.exDate=exDate;
        this.ccv=ccv;
    }
    
}
