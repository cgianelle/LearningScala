import scala.io.StdIn.readLine;

object SayingHello {

  def createGreeting(name: String): String = {
  	return String.format("Hello, %s, nice to meet you!", name)
  }

  def output(message: String) = {
  	println(message)
  }	

  def main(args: Array[String]): Unit = {
    val hello = scala.io.StdIn.readLine("What is your name? ")
    output(createGreeting(hello))
  }
}