package chap12;

 class TimeAccount {
  private String name;
  private String no;
  private long balance;
  private long timeBalance;
  TimeAccount (String n, String num, long z, long timeBalance) {
    this.name = n; this.no = num; this.balance = z; this.timeBalance = timeBalance;
  }
  public String getName() { return this.name; }
  public String getNo() { return this.no; }
  public long getBalance() { return this.balance; }
  public long getTimeBalance() { return this.timeBalance; }
  public void deposit(long k) { balance += k; }
  public void withdraw(long k) { balance -= k; }
  public void cancel() {
    balance += timeBalance;
    timeBalance = 0;
  }
  public static int compBalance(TimeAccount a, TimeAccount b) {
    if (a.getBalance() > b.getBalance()) {
      return 1;
    } else if (a.getBalance() < b.getBalance()){
      return -1;
    } return 0;
    
  }


}
