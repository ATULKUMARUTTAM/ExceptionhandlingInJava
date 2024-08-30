public class insufficientbalance extends RuntimeException{
    private String msg;

    public insufficientbalance(String msg) {
        this.msg = msg;
    }
}
