import java.util.Set;


@FunctionalInterface
public interface PartyInfoCounsumer {
  public abstract void process(Set<Hero> party, Hero leader);
}
