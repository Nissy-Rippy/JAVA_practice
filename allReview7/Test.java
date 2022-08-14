public class Test {

  public void saveHeroToFile(Hero h) {
    Writer w = new BufferedWriter(new FileWriter("rpgsave.dat", true));
    w.write(h.name + "\n");
    w.write(h.hp + "\n");
    w.write(h.mp + "\n");
    w.flush();
    w.close();
}


  
  public static void main(String[] args) {
    
  }
}
