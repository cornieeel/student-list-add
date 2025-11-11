package org.example.list;

public class Model
{
  private final String user;
  private final int age;

  public Model(String user, int age){
    this.user = user;
    this.age = age;
  }

  public int getAge()
  {
    return age;
  }

  public String getUsername()
  {
    return user;
  }
}
