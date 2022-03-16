class CredidCard extends Payment{
    constructor(id,cardNumber,exDate,cvv){
        super(id);
        this.cardNumber=cardNumber;
        this.exDate=exDate;
        this.cvv=cvv;
    }
}