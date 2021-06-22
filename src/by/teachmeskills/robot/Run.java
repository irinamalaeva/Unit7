package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead(21);
        SamsungHead samsungHead = new SamsungHead(22);
        ToshibaHead toshibaHead = new ToshibaHead(20);

        SonyHand sonyHand = new SonyHand(11);
        SamsungHand samsungHand = new SamsungHand(10);
        ToshibaHand toshibaHand = new ToshibaHand(9);

        SonyLeg sonyLeg = new SonyLeg(9);
        SamsungLeg samsungLeg = new SamsungLeg(8);
        ToshibaLeg toshibaLeg = new ToshibaLeg(7);

        Robot robot1 = new Robot(sonyHead, samsungHand, toshibaLeg);
        Robot robot2 = new Robot(samsungHead, toshibaHand, sonyLeg);
        Robot robot3 = new Robot(toshibaHead, sonyHand, samsungLeg);

        robot1.action();
        robot2.action();
        robot3.action();

        System.out.println(" Price1Robot1 = " + robot1.getPrice());
        System.out.println(" Price2Robot2 = " + robot2.getPrice());
        System.out.println(" Price3Robot3 = " + robot3.getPrice());

        int price1 = robot1.getPrice();
        int price2 = robot2.getPrice();
        int price3 = robot3.getPrice();
        int maxPrice;
        if (price1 > price2) {
            maxPrice = price1;
            if (maxPrice > price3){
                System.out.println("MaxPrice Robot1 = " + maxPrice);}
                else{
                    maxPrice = price3;
                    System.out.println("MaxPrice Robot3 = " + maxPrice);
            }
        }
        else{
            maxPrice = price2;
            if(maxPrice > price3){
                System.out.println("MaxPrice Robot2 = " + maxPrice);}
            else{
                maxPrice = price3;
                System.out.println("MaxPrice Robot3 = " + maxPrice);
            }
        }
        if (price1 == price2 && price1 < price3){
            System.out.println("MaxPrice Robot3 = " + price3);
        }
        if (price1 == price2 && price1 > price3){
            System.out.println("MaxPrice Robot1 = Robot2 = " + price1);
        }
        if (price1 == price3 && price1 < price2){
            System.out.println("MaxPrice Robot2 = " + price2);
        }
        if (price1 == price3 && price1 > price2){
            System.out.println("MaxPrice Robot1 = Robot3 = " + price1);
        }
        if (price2 == price3 && price2 < price1){
            System.out.println("MaxPrice Robot1 = " + price1);
        }
        if (price2 == price3 && price2 > price1){
            System.out.println("MaxPrice Robot2 = Robot3 = " + price2);
        }
        if(price1 == price2 && price1 == price3){
            System.out.println("Price Robot1 = Robot2 = Robot3 = " + price1);
        }





        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
