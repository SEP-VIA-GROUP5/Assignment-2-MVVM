package model;

import java.util.ArrayList;

public class UserList
{
  private ArrayList<User> users;

  public UserList()
  {
    this.users = new ArrayList<>();
  }

  public ArrayList<User> getUsers()
  {
    return users;
  }

  @Override public String toString()
  {
    return "UserList{" + "users=" + users + '}';
  }
}
