abstract class TrunkCall {
    int duration;
    abstract double calculateCharges();
}

class OrdinaryTrunkCall extends TrunkCall {
    OrdinaryTrunkCall(int duration) {
        this.duration = duration;
    }

    double calculateCharges() {
        return duration * 1;
    }
}

class UrgentTrunkCall extends TrunkCall {
    UrgentTrunkCall(int duration) {
        this.duration = duration;
    }

    double calculateCharges() {
        return duration * 26;
    }
}

class LightningTrunkCall extends TrunkCall {
    LightningTrunkCall(int duration) {
        this.duration = duration;
    }

    double calculateCharges() {
        return duration * 34;
    }
}

public class q4 {
    public static void main(String[] args) {
        TrunkCall o = new OrdinaryTrunkCall(10);
        TrunkCall u = new UrgentTrunkCall(10);
        TrunkCall l = new LightningTrunkCall(10);

        System.out.println("Charges for ordinary trunk call: " + o.calculateCharges());
        System.out.println("Charges for urgent trunk call: " + u.calculateCharges());
        System.out.println("Charges for lightning trunk call: " + l.calculateCharges());
    }
}