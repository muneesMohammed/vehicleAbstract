public interface vehicle1{

        void changeGear();
        void applyBreak();
        void speedUp();
    public static void main(String[] args) throws InterruptedException {
        car gear =new car();
        gear.changeGear();
        Thread.sleep(600);
        car speedup1 =new car();
        speedup1.speedUp();
        Thread.sleep(600);
        car break1 =new car();
        break1.applyBreak();
        Thread.sleep(1000);
        bike gear2 =new bike();
        gear2.changeGear();
        Thread.sleep(600);
        bike speedup2 =new bike();
        speedup2.speedUp();
        Thread.sleep(600);
        bike break2 =new bike();
        break2.applyBreak();
        Thread.sleep(1000);
        bicycle gear3 =new bicycle();
        gear3.changeGear();
        Thread.sleep(600);
        bicycle speedup3 =new bicycle();
        speedup3.speedUp();
        Thread.sleep(600);
        bicycle break3 =new bicycle();
        break3.applyBreak();
    }
    }
    class car implements vehicle1 {
        public void changeGear() {
            System.out.println(" car gear changed");
        }

        public void applyBreak() {
            System.out.println(" car break applied");
        }

        public void speedUp() {
            System.out.println(" car speed increased");
        }
    }
        class bike implements vehicle1 {
            public void changeGear() {
                System.out.println(" bike gear changed");
            }

            public void applyBreak() {
                System.out.println(" bike break applied");
            }

            public void speedUp() {
                System.out.println(" bike speed increased");
            }

        }
class bicycle implements vehicle1 {
    public void changeGear() {
        System.out.println(" bicycle gear changed");
    }

    public void applyBreak() {
        System.out.println(" bicycle break applied");
    }

    public void speedUp() {
        System.out.println(" bicycle speed increased");
    }

}

