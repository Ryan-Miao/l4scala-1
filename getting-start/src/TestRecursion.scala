object TestRecursion{
	
	def main(args: Array[String]){
		for (i <- 1 to 10){
			println(i + " 的阶乘=" + factorial(i))
		}
	}

	def factorial(n: BigInt) : BigInt = {
		if( n <= 1){
			1
		}else{
			n * factorial(n-1)
		}
	}
}