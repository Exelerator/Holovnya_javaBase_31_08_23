package ua.hillel.Holovnya.lessons.lesson12.car;

public class Car {

    private int countWheels;
    private boolean isStart;
    private double fuelStatus;
    private String modelName;

    public Car(int countWheels, boolean isStart, double fuelStatus, String modelName) {
        this.countWheels = countWheels;
        this.isStart = isStart;
        this.fuelStatus = fuelStatus;
        this.modelName = modelName;
    }

    void start() {
        startElectronicSystem();
        startFuelSystem();
        startGPSSystem();
        isStart = true;
    }


    void startElectronicSystem() {
        System.out.println("start electronic system...");
    }

    void startFuelSystem() {
        System.out.println("start fuel system...");
    }

    void startGPSSystem() {
        System.out.println("start GPS system...");
    }


        //    public String getModelName() {
//        return modelName;
//    }
//
//    public void setModelName(String modelName) {
//        this.modelName = modelName;
//    }



        public int getCountWheels() {
            return countWheels;
        }

        public boolean isStart() {
            return isStart;
        }

        public double getFuelStatus() {
            return fuelStatus;
        }

        public String getModelName() {
            return modelName;
        }



        public void setCountWheels(int countWheels) {
            this.countWheels = countWheels;
        }

        public void setFuelStatus(double fuelStatus) {
            this.fuelStatus = fuelStatus;
    }
}


