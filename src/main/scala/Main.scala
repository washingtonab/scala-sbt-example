import org.apache.log4j.Logger
import org.apache.log4j.MDC

object Main extends App {

  MDC.put("separator", "sseepp");

  var logger = Logger.getLogger(getClass)
  logger.info("testando")

  println("Hello Scala")
}

