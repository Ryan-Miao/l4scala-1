object TestFunCurrying {
	def add(x:Int, y:Int) = x + y
	def add2(x: Int, y: Int) : Int = {
		x + y
	}
	def add3(x: Int, y: Int) :Unit = {
		println("返回空")
		x + y
	}
	def add4 = (x: Int, y: Int) => x +y
	def anonymousFun = () => println("匿名函数怎么用，没有返回值怎么办")

	//柯里化 Currying
	def addCurrying(x: Int)(y:Int) = x + y

	def addCurrying2(x: Int) = (y: Int) => x+y


	def main(args: Array[String]): Unit = {
		println(add(1,2))
		println(add2(1,2))
		println(add3(1,2))
		println(add4(1,2))
		println(anonymousFun())
		println(addCurrying(1)(2))
		println(addCurrying(1)(_))
		
		
	}
}