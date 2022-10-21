public class AdapteeN implements Adapter {

    @Override
    public void methodA() {
        methodN();
    }

    private void methodN() {}
}
