object TestClosure {

	/**
	* 在multiplier中有两个变量: i 和factor， 其中i是函数形式参数，factor是自由变量。
	* multiplier成为一个闭包，因为它引用到函数外面定义的变量，定义这个函数的过程是
	* 将这个自由变量捕获而构成一个封闭的函数。
	**/
	var factor = 3;
	val multiplier = (i:Int) => i * factor;

	def main(args: Array[String]): Unit = {
		println(multiplier(1))
		println(multiplier(2))
	}
}