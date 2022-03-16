from ast import Str
import email
from payment import Payment
class Paypal(Payment):
    email   =   Str
    def __init__(self, id,email):
        super.__init__(id)
        self.email=email