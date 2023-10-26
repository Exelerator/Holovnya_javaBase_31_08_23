package ua.hillel.Holovnya.lessons.lesson14.classes;

public class Car {
    private String modelName;
    private double fuelStatus;
    private boolean isStart;
    private Engine engine;

    private static int demoVariable;

    public Car(String modelName, double fuelStatus, double horsePower) {
        this.modelName = modelName;
        this.fuelStatus = fuelStatus;
        this.isStart = isStart;
        this.engine = new Engine(horsePower);
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void drive() {
        if (isStart) {
            System.out.println("car " + modelName + " rides");
        } else {
            System.out.println("car " + modelName + " cant move");
        }
    }


    public void demoLocalClass() {

        class LocalClass {
            int variable = 10;

            public LocalClass(int variable) {
                this.variable = variable;
            }

            void method() {

            }
        }

        LocalClass localClass = new LocalClass(111);
        localClass.method();
        localClass.variable = 23232;
        System.out.println(localClass.variable);
    }

//    public void demoLocalClass2() {
//        LocalClass localClass = new LocalClass(111);
//        localClass.method();
//        localClass.variable = 23232;
//        System.out.println(localClass.variable);
//    }


    class Engine {

        double horsePower;

        public Engine(double horsePower) {
            this.horsePower = horsePower;
        }

        public void start() {
            isStart = true;
        }

        public void stop() {
            isStart = false;
        }

        void demo() {
            System.out.println(modelName);
            System.out.println(demoVariable);
        }

    }

    static class Door {

        String title;

        public Door(String title) {
            this.title = title;
        }

        void demo() {
            System.out.println(demoVariable);
        }

    }

}
