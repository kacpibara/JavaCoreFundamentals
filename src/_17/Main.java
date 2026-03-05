package _17;

import _17.NewWayPolimorphism.AdvancedEngine;
import _17.NewWayPolimorphism.ElectricEngine;
import _17.OldWayWithEnumAndSwitch.BasicEngine;
import _17.OldWayWithEnumAndSwitch.EngineType;

public class Main {
    static void main(String[] args) {
        // --- WAY 1: ENUM & SWITCH ---
        BasicEngine v8 = new BasicEngine(EngineType.PETROL);
        v8.start();

        // --- WAY 2: POLYMORPHISM ---
        AdvancedEngine teslaMotor = new ElectricEngine();
        teslaMotor.start();
    }
}
