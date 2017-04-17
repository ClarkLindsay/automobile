package edu.jalc.automobile.onlinebuilder.components.suspension.towing;


import edu.jalc.automobile.parts.suspension.Shock;
import edu.jalc.automobile.parts.suspension.Spring;
import edu.jalc.automobile.parts.suspension.HeavyShock;
import edu.jalc.automobile.parts.suspension.HeavySpring; 


public class TowingHeavyDuty extends Towing{

   private HeavyShock shock;
   private HeavySpring spring;
   private Tire tire;
   private SteelWheel steelWheel;

   private TowingHeavyDuty(){
      this.shock = null;
      this.spring = null;
      this.tire = null;
      this.steelWheel = null;
   }

  public TowingHeavyDuty(HeavyShock shock, HeavySpring spring, AllTerrainTire tire,SteelWheel steelWheel){

      this.shock = shock;
      this.spring = spring;
      this.tire = tire;
      this.steelWheel = steelWheel;
   }

   public Shock getShock(){
      return shock;
   }

   public Spring getSpring(){
      return spring;
   }

   public Tire getTire() {
      return tire;
   }

   public SteelWheel getWheel() {
      return steelWheel;
   }

   public String toString(){
      return "Towing Heavy Duty has:\n" +
             "\t" + shock.toString() + "\n" +
             "\t" + spring.toString() + "\n" +
              "\t" + tire.toString() + "\n" +
              "\t" + steelWheel.toString() + "\n";
   }

}
