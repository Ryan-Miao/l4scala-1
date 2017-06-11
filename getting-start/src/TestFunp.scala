object TestFunp{
	def main(args: Array[String]) {
		delayed(time());
	}

	def time() = {
		println("Get time, unit is nano")
		System.nanoTime
	}

	def delayed(t: => Long) = {
		println("Int the delayed method:")
		println("param: " + t)
		t
	}
}