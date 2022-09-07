package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
             //> sout("iterating till the end") and print all the numbers till the end, otherwise all numbers till toBreakWith.
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(numberToGoUntil < toBreakWith){
            System.out.println("iterating till the end");
        }

        for (int i = 1; i <= numberToGoUntil; i++) {
            System.out.println(i);
            if (i == toBreakWith){
                break;
            }

        }

    }
}
