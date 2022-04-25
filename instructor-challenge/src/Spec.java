package src;

public class Spec {

    public static void main(String[] args) {
        test();
    }

    public static boolean test1() {
        VendingMachine vm = new VendingMachine();
        vm.setAmount_paid(100);
        vm.setItem_cost(50.76);
        String message = vm.optimal_change(vm.getItem_cost(), vm.getAmount_paid());
        if (message != null) {
            System.out.println("test1");
            System.out.println(message);
            return true;
        } else {
            return false;
        }
    }

    public static boolean test2() {
        VendingMachine vm = new VendingMachine();
        vm.setAmount_paid(100);
        vm.setItem_cost(80.55);
        String message = vm.optimal_change(vm.getItem_cost(), vm.getAmount_paid());
        if (message != null) {
            System.out.println("test2");
            System.out.println(message);
            return true;
        } else {
            return false;
        }
    }

    public static boolean test3() {
        VendingMachine vm = new VendingMachine();
        vm.setAmount_paid(300);
        vm.setItem_cost(294.43);
        String message = vm.optimal_change(vm.getItem_cost(), vm.getAmount_paid());
        if (message != null) {
            System.out.println("test3");
            System.out.println(message);
            return true;
        } else {
            return false;
        }
    }

    public static boolean test4() {
        VendingMachine vm = new VendingMachine();
        vm.setAmount_paid(600);
        vm.setItem_cost(552.30);
        String message = vm.optimal_change(vm.getItem_cost(), vm.getAmount_paid());
        if (message != null) {
            System.out.println("test4");
            System.out.println(message);
            return true;
        } else {
            return false;
        }
    }
    public static void test() {
        if (test1() == true) {
            if (test2() == true) {
                if (test3() == true) {
                    if (test4() == true) {
                        System.out.println("All tests passed!");
                    }
                }
            }
        } else {
            System.out.println("Something wrong with the program!");
        }
    }
}
