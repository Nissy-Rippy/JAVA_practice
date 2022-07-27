// package chap31JUnit;

public class Account {
  String owner;
  int zandaka;

  public  Account(String owner, int zandaka) {
    this.owner = owner;
    this.zandaka = zandaka;
    assert zandaka >= 0;
    assert owner.class == String;
  }

  public void transfer(Account dest, int amount) {
    dest.zandaka += amount;
    zandaka -= amount;
    assert this.zandaka >= 0 : "負の数になっとるやんかーい！";
  }
}
