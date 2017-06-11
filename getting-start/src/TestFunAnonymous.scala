object TestFunAnonymous {
	def main(args: Array[String]): Unit = {
		var inc = (x:Int) => x + 1
		println(inc(1))
		println(add2(1))

		var mul = (x: Int, y: Int) => x*y
		println(mul(3,4))
		println(mul2(3,4))

		var usrDir = () => {System.getProperty("user.dir")}
		println(usrDir());

		println(multiplier(2))

	}

	var factor = 3
	val multiplier = (i:Int) => i*factor

	def add2 = new Function1[Int, Int]{
		def apply(x:Int):Int = x+1;
	}
	def mul2(x: Int, y: Int) : Int = {
		x * y
	}
}