package com.gengsc.bridge.CARP;

public class Demo {

    public static void main(String[] args) {
        System.out.println("M品牌");
        HandsetBrand brandM = new HandsetMBrand();
        brandM.setSoft(new HandsetGame());
        brandM.run();
        brandM.setSoft(new HandsetAddressList());
        brandM.run();
        brandM.setSoft(new HandsetMp3());
        brandM.run();
        System.out.println("---------------------");

        System.out.println("S品牌");
        HandsetBrand brandS = new HandsetSBrand();
        brandM.setSoft(new HandsetGame());
        brandM.run();
        brandM.setSoft(new HandsetAddressList());
        brandM.run();
        brandM.setSoft(new HandsetMp3());
        brandM.run();
        System.out.println("---------------------");

        System.out.println("N品牌");
        HandsetBrand brandN = new HandsetNBrand();
        brandM.setSoft(new HandsetGame());
        brandM.run();
        brandM.setSoft(new HandsetAddressList());
        brandM.run();
        System.out.println("---------------------");


    }
}
