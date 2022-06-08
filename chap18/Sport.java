package chap18;
//Sport sport = Sport.Soccer.getGender(); sport == "male";
public enum Sport {

  Soccer(11, "male") {
    @Override
    void club() { System.out.println("これはサッカーです"); }
  },
   BaseBall(9, "male") {
     @Override
     void club() { System.out.println("これは野球です！"); }
   }, 
   BasketBall(5, "male") {
     @Override
     void club() { System.out.println("これはバスケットです"); }
   };

  //列挙型のフィールド
  private int member;
  private String gender;

  //列挙型のコンストラクタ
  private Sport(int member, String gender) { this.member = member; this.gender = gender; }

  public int getMember(){ return this.member; }
  public String getGender() { return this.gender; }
  
  abstract void club();
}

