public class customer {

    private int accno;
    private String Name;
    private int bal;
    private insufficientbalance balcheck;

    public customer(int accno, String name, int bal) {
        this.accno = accno;
        Name = name;
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "customer{" +
                "accno=" + accno +
                ", Name='" + Name + '\'' +
                ", bal=" + bal +
                '}';
    }
    public void withdraw(int amt)
    {
        if (amt>bal)
            throw new insufficientbalance("Insufficinet Balance");
        bal = bal-amt;
    }
    public void deposit(int amt)
    {
        if(amt>50000)
            throw new BalanceCheck("Depositing morethan 50K");
        bal = bal+amt;
    }


}
