package chap12;

class TimeAccount1 extends TimeAccount{
  private long timeBalance;
  TimeAccount1(String name, String no, long balance, long timeBalance) {
    super(name, no, balance);
    this.timeBalance = timeBalance;
  }
  public long getTimeBalance(){ return this.timeBalance; }
  public void cancel() {
    deposit(timeBalance);
    timeBalance = 0;
  }
  }
}
