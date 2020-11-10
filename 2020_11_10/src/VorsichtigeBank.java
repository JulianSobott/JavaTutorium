public class VorsichtigeBank extends SichereBank{

    private double maxBetrag;

    public VorsichtigeBank(double maxBetrag, Bank bank2) {
        this.maxBetrag  = maxBetrag;
    }

}
