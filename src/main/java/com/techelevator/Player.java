package com.techelevator;

import com.techelevator.util.MoneyFormatter;
import java.util.Map;

public class Player {

  private String firstName = "";
  private String lastName = "";
  private double capSpace = 0.0;
  private int jerseyNumber = 0;
  private String position = "";
  Map<String, Integer> stats;

  public Player(
    int jerseyNumber,
    String firstName,
    String lastName,
    String position,
    double capSpace,
    Map<String, Integer> stats
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.capSpace = capSpace;
    this.jerseyNumber = jerseyNumber;
    this.position = position;
    this.stats = stats;
  }

  public void show() {
    System.out.println(
      jerseyNumber +
      ") " +
      firstName +
      " " +
      lastName +
      " " +
      position +
      " " +
      MoneyFormatter.formatMoney(capSpace)
    );
  }

  public void showStats() {
    for (Map.Entry<String, Integer> entry : stats.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

  public double getCapSpace() {
    return capSpace;
  }

  public int getJerseyNumber() {
    return jerseyNumber;
  }

  public String getPosition() {
    return position;
  }

  public Map<String, Integer> getStats() {
    return stats;
  }

  public String getName() {
    return firstName + " " + lastName;
  }
}
