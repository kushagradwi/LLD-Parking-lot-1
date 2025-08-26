package Models.Gate;

public abstract class Gate {
    String id;
    GateType gateType;
    public String getId() {
        return id;
    }
    public GateType getGateType() {
        return gateType;
    }
}
