import scala.io.StdIn.readLine;
import scala.collection.mutable.ListBuffer

object SimpleMath {

    def addNumbers(num1: Int, num2: Int): String = {
       return "%d + %d = %d".format(num1, num2, (num1 + num2))
    }

    def subNumbers(num1: Int, num2: Int): String = {
       return "%d - %d = %d".format(num1, num2, (num1 - num2))
    }

    def multNumbers(num1: Int, num2: Int): String = {
       return "%d * %d = %d".format(num1, num2, (num1 * num2))
    }

    def divNumbers(num1: Int, num2: Int): String = {

       return "%d / %d = %.2f".format(num1, num2, (num1.toFloat / num2))
    }

    def buildLB(funcList: List[(Int, Int) => String], num1: Int, num2: Int): ListBuffer[String] = {
        var outputLB = new ListBuffer[String]()
        for(func <- funcList) {
            outputLB += func(num1, num2)
        }
        return outputLB        
    }

  	def main(args: Array[String]): Unit = {
    	val input1 = scala.io.StdIn.readLine("What is the first number? ")
    	val input2 = scala.io.StdIn.readLine("What is the second number? ")

    	try {
            val funcList = List(addNumbers _, subNumbers _, multNumbers _, divNumbers _)
            buildLB(funcList, input1.toInt, input2.toInt).map(x => println(x))
		} catch {
			case nfe: NumberFormatException => nfe.printStackTrace
		}
  	}
}