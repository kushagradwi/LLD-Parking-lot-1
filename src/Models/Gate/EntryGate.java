package Models.Gate;

public class EntryGate extends Gate{
    public EntryGate(String id){
        this.id=id;
        this.gateType=GateType.ENTRY;
    }
}
