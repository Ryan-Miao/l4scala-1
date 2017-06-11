object TestFun {
	def addInt( a:Int, b:Int) :Int = {
		var sum:Int = 0;
		sum = a + b;

		return sum;
	}

	def printMe(): Unit = {
		println("Hello, Scala")
	}

	def main(args: Array[String]) {
		var result = addInt(1, 2);
		println(result);

		printMe();
	}
}