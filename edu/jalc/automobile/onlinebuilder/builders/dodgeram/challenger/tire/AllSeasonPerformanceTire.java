package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.tire;

import edu.jalc.automobile.parts.suspension.SportTire;

public class AllSeasonPerformanceTire extends SportTire{

  private String description;

  public AllSeasonPerformanceTire(double height, double width, String description){
    super(height, width);
    this.description = description;
  }

  public String toString(){
    return this.description + " All Season Performance Tires";
  }

}
