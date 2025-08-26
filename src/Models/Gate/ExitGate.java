package Models.Gate;

public class ExitGate extends Gate{
    public ExitGate(String id){
        this.id=id;
        this.gateType=GateType.EXIT;
    }
}
