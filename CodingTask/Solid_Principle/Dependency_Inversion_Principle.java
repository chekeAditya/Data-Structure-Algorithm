package Basic_To_Advanced_DataStructure.CodingTask.Solid_Principle;

public class Dependency_Inversion_Principle {
}

/**
 * Before using this principle

class Engine {
}

class ToyCar {
    private final Object Engine;
    Engine engine;

    ToyCar() {
        Engine = new Engine();
    }
}
 */

/**
 * After using this principle
 */
interface IEngine{
}

class Engine implements IEngine{
    double capacity;
}

class ToyCar{
    IEngine iEngine;
    ToyCar(IEngine engine){
        iEngine = engine;
    }
}
