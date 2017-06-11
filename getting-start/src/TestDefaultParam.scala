object TestDefaultParam {
	def main(args: Array[String]){
		println("return: " + addInt())
		println("return: " + addInt(1, 2))
		println("return: " + addInt(b = 1, a = 2))
	}

	def addInt(a: Int=5, b:Int=7) : Int = {
		println("a="+a)
		println("b="+b)
		var sum:Int = 0;
		sum = a + b;

		return sum;
	}
}