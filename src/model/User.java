package model;

import java.util.Random;

public class User
{
  private String name;

  public User()
  {
    Random rand = new Random();
    this.name = "User" + rand.nextInt(100);
  }

  public User(String name)
  {
    this.name = name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  @Override public String toString()
  {
    return "User{" + "name='" + name + '\'' + '}';
  }
}
