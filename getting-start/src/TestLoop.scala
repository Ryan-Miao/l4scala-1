object TestLoop {
	def main (args: Array[String]) {
		loopWhile
		loopFor()
		loopFor2()
		loopForList
		loopForFilter
		for_yield
		loopForMany
	}

	def loopWhile(){
		var a = 10;

		while(a >0){
			a -= 1;
			println("while:"+a);
		}
	}

//Range 可以是一个数字区间表示 i to j ，或者 i until j。左箭头 <- 用于为变量 x 赋值。
	def loopFor(){
		var a = 0;
		for( a <- 1 to 10){
			println("to:"+a);
		}
	}

	def loopForMany(){
		var a = 0;
		var b = 0;
		for( a <- 0 to 3; b <- 1 to 4) {
			println("for-;-many:"+a+","+b)
		}
	}

	def loopFor2(){
		var a = 0;
		for( a <- 1 until 10){
			println("until:"+a)
		}
	}

	def loopForList(){
		var a = 0;
		var numList = List(1,2,3,4,5);

		for( a <- numList){
			println("list:" +a)
		}
	}

	def loopForFilter(){
		var a = 0;
		var numList = List(1,2,3,4,5);

		for( a <- numList
			if a%2==0
			){
			println("for-filter:"+ a)
		}
	}

	def for_yield(){
		var a = 0;
		val numList = List(1,2,3,4,5,6,7,8,9,10);

		var retVal = for{a <- numList
						if a%2==0
						}yield a

		for( a <- retVal) {
			println("for-yield:"+a)
		}
	}
}