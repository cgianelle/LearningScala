import scala.io.StdIn.readLine;

object SayingHello {

  def createGreeting(name: String): String = {
  	return "Hello, %s, nice to meet you!".format(name)
  }

  def output(message: String) = {
  	println(message)
  }	

  def main(args: Array[String]): Unit = {
    val hello = scala.io.StdIn.readLine("What is your name? ")
    output(createGreeting(hello))
  }
}