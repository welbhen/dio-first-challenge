class BankAcc {
    constructor(ag, number, type) {
        this.ag = ag;
        this.number = number;
        this.type = type;
        this._balance = 0;
    }

    get balance() {
        return this._balance;
    }
    set balance(value) {
        this._balance = value;
    }

    withdraw(value) {
        if(value <= this._balance){
            this._balance = this._balance - value;
            return "New balance: " + this._balance + " $";
        }
        else{
            return "Insufficient funds!";
        }
    }
    deposit(value) {
        this._balance = this._balance + value;
        return "New balance: " + this._balance + " $";
    }
}

class CheckingAcc extends BankAcc {
    constructor(ag, number, creditCard) {
        super(ag, number);
        this.type = 'checking';
        this._creditCard = creditCard;
    }

    get creditCard() {
        return this._creditCard;
    }
    set creditCard(value) {
        this._creditCard = value;
    }
}

class SavingAcc extends BankAcc {
    constructor(ag, number) {
        super(ag, number);
        this.type = 'saving';
    }
}

class StudentAcc extends BankAcc {
    constructor(ag, number) {
        super(ag, number);
        this.type = 'student';
    }

    withdraw(value) {
        if(value <= this._balance && value <= 500){
            this._balance = this._balance - value;
            return "New balance: " + this._balance + " $";
        }
        else{
            return "Operation not allowed!";
        }
    }
}