package chap26;

import org.apache.logging.log4j.*;

public class Log4j2 {
  public static void main(String[] args) {
    Logger logger = LogManager.getLogger(Log4j2.class);
    if (args.length != 2) {
      logger.error("起動数の数が異常！！" + args.length);
    }
  }
}