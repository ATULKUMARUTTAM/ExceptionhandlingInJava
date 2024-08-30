public class BalanceCheck extends RuntimeException{

    private String msg;

    public BalanceCheck(String msg) {
        this.msg = msg;
    }
}
