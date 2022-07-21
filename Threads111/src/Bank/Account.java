package Bank;



public class Account {
    private String accountnumber,Name,Email,Phonenumber;
    private double Balance;

    Account( String accountnumber,String Name,String Email,String Phonenumber,double Balance) {
        this.accountnumber=accountnumber;
        this.Name=Name;
        this.Email=Email;
        this.Phonenumber=Phonenumber;
        this.Balance=Balance;
    }

    public void DepositMoney(double DepositedMoney) {
        this.Balance+=DepositedMoney;
        System.out.println("Deposit success..current balance is " +this.Balance);
    }

    public void WithdrawlMoney(double WithdrawlMoney) {
        if (this.Balance-WithdrawlMoney<0) {
            System.out.println("failed....left" +this.Balance);
        } else {
            this.Balance-=WithdrawlMoney;
            System.out.println("successful  " +this.Balance);
        }
    }



    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}
