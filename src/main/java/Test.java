/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */

public class Test {
        double principal;
        double ROI;
        double NOY;

        public Test(double principal, double ROI,double NOY){
            this.principal = principal;
            this.ROI = ROI;
            this.NOY = NOY;
        }
        public double SimpleInterest(){
            double ROIA =ROI/100;
            double SI = principal * (1 + ROIA * NOY);
            return SI;
        }
    }

