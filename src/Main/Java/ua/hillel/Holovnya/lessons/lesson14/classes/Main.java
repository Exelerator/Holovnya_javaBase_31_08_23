package ua.hillel.Holovnya.lessons.lesson14.classes;

public class Main {
    public static void main(String[] args) {
        //        Car car = new Car("BMW", 50, 350);
//        car.start();
//        car.drive();

//        Car.Door door = new Car.Door("Left door");
//        door.demo();



//        DemoClass demoClass = new DemoClass() {
//
//            @Override
//            public void demoMethod() {
//                System.out.println("demo method from anonimus class");
//            }
//
//            @Override
//            public void demoMethod2() {
//
//            }
//
//            @Override
//            public void demoMethod3() {
//
//            }
//
//            @Override
//            public void demoMethod4() {
//
//            }
//        };
//
//        demoClass.demoMethod();
//
//        DemoInterface demoInterface = new DemoInterface() {
//            @Override
//            public void demoMethod() {
//                System.out.println("demo method from anonimus class");
//            }
//        };
//
//        demoInterface.demoMethod();


        DemoClass2 demoClass2 = new DemoClass2() {

            @Override
            public void method() {
                System.out.println("FROM MAIN CLASS");
            }

            @Override
            public void method2() {
                System.out.println("METHOD 2 FROM MAIN CLASS");
            }
        };
        demoClass2.method();
        demoClass2.method2();

    }
}
