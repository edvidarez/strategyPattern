package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball basket = new BasketBall();
        Ball front = new frontenis();
        Ball ping = new PingPong();
        Ball tennis = new tennisBall();
        Ball golf = new GolfBall();

        System.out.println();

        System.out.println(golf.roll());
        System.out.println(golf.performBounce());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.getSize());

        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.getSize());

        System.out.println();



        System.out.println(ping.roll());
        System.out.println(ping.performBounce());
        System.out.println(ping.performDeflate());
        System.out.println(ping.performInflate());
        System.out.println(ping.getSize());

        System.out.println();


        System.out.println(front.roll());
        System.out.println(front.performBounce());
        System.out.println(front.performDeflate());
        System.out.println(front.performInflate());
        System.out.println(front.getSize());

        System.out.println();

        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());
        System.out.println(basket.getSize());

        System.out.println();


        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.getSize());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.getSize());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.getSize());

        System.out.println();



    }
}
