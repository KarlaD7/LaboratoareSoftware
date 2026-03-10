package ro.ulbs.proiectaresoftware.lab2;

import java.util.*;

public class problema251 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            x.add(random.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(random.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);
        System.out.println("lista x" + x);
        System.out.println("lista y" + y);

        //a) xPlusY conţine toate elementele şirurilor x şi y;
        List<Integer> xPlusY = new ArrayList<>();
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("a)toate nr din ambele liste: " + xPlusY);


        //b) zSet conţine numai valorile comune din ambele şiruri, luate o singură dată;
        Set<Integer> zSet = new TreeSet();
        for(Integer numar:x){
            if(y.contains(numar)) {
                zSet.add(numar);
            }
        }
        System.out.println("b)comune (o singură data): " + zSet);


        //c) xMinusY conţine valorile din şirul x care nu se află în şirul y;
        List<Integer> xMinusY = new ArrayList(x);
        xMinusY.removeAll(y);
        System.out.println("c)ce e in x, dar in y nu: " + xMinusY);


        //d) xPlusYLimitedByP este mulţimea elementelor din x şi y ce nu depăşesc valoarea p.
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();
        for (Integer numar : xPlusY) {
            if (numar <= p) {
                xPlusYLimitedByP.add(numar);
            }
        }
        System.out.println("d)mai mici sau egale cu 4: " + xPlusYLimitedByP);

    }
}