package structuralDesignPatterns.adapter;

import structuralDesignPatterns.adapter.adapters.SquarePegAdapter;
import structuralDesignPatterns.adapter.round.RoundHole;
import structuralDesignPatterns.adapter.round.RoundPeg;
import structuralDesignPatterns.adapter.square.SquarePeg;


public class Demo {
    public static void main(String[] args) {
        //Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //hole.fits(smallSqPeg); // Won't compile.

        //Adapter solves the problem.
        SquarePegAdapter smaleSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smaleSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
