package Models.ParkingSlot;

public class ParkingSlotFactory {

    public static ParkingSlots createParkingSlot(SlotType type, String id) {
        switch (type) {
            case LIGHT:
                return new LightParkingSlot(id);
            case MEDIUM:
                return new MediumParkingSlot(id);
            case HEAVY:
                return new HeavyParkingSlot(id);
            default:
                throw new IllegalArgumentException("Unknown slot type: " + type);
        }
    }
}
