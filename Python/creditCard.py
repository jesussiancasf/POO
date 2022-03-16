from ast import Str
from calendar import c
import datetime
from payment import Payment
class CreditCard(Payment):
    cardNumber  = Str
    exDate      = datetime
    cvv         = int

    def __init__(self, id, cardNumber, exDate, cvv):
        super.__init__(id)
        self.cardNumber=cardNumber
        self.exDate=exDate
        self.cvv=cvv