from account import Account
from car import Car
#Debemos iportar la clase para poder acceder a ella
if __name__ == "__main__":
    car=Car("asa12",Account("JEsùs","Jes123"))
    print(vars(car))
    print(vars(car.driver))
