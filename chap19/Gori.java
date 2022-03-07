package chap19;

public interface Gori {
  public String hello();
  public int num();
}

class Goriri implements Gori{
  @Override
  public String hello() { return "こんにちは"; }
  @Override
  public int num() { return 44; }
}

