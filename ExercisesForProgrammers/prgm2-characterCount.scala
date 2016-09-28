import scala.io.StdIn.readLine;

object CharacterCount {

  def createCharCountMessage(message: String): String = {
  	return "Did you know, '%s', has %d characters?".format(message, message.length())
  }

  def output(message: String) = {
  	println(message)
  }	

  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("What is your input string? ")
    output(createCharCountMessage(input))
  }
}