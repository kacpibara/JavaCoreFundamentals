package _17.OldWayWithEnumAndSwitch;

public class BasicEngine {
    private EngineType engineType;

    public BasicEngine(EngineType engineType) {
        this.engineType = engineType;
    }

    public void start(){
        switch(engineType){
            case PETROL:
                System.out.println("Petrol Engine: WROOOM!");
                break;
            case ELECTRIC:
                System.out.println("Electric Engine: Bzzzz");
                break;
            case AUTOGAS:
                System.out.println("AutoGas Engine: WROOOM!");
                break;
            case DIESEL:
                System.out.println("Diesel Engine: KLE KLE KLE!");
                break;
            default:
                System.out.println("Unknown EngineType!");
                break;
        }
    }
}
