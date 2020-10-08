package headfirst.proxy.gumball;

public class GumballMachineTestDrive2 {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;

        try {
            count = 10;

            gumballMachine = new GumballMachine("a100", count);
            System.out.println(gumballMachine.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
