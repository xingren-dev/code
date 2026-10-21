package com.xingren.interfacedemo;

public interface Swim {
   void swim();

   default void swim2() {
      System.out.println("swim2");
      swim3();
   }

   private void swim3() {
      System.out.println("swim3");
   }

   static void swim4() {
      System.out.println("swim4");
   }
}
