import scala.Array._
object TestArray{

	def main(args: Array[String]): Unit = {
		var z:Array[String] = new Array[String](3)

		var x = new Array[String](3)

		z(0) = "H"
		println(z(0))

		var y = Array("Runoob", "Baidu", "Expedia")
		println(y(1))

		handleArray()

		multyDimension();

		mergeArray()

		rangeArr()
	}	


	def handleArray() = {
		var myArray = Array(1.9, 2, 3.4, 5.0)

		//out
		for(x <- myArray){
			println(x)
		}

		var total = 0.0;
		for( i <- 0 to (myArray.length -1)) {
			total += myArray(i);

		}
		println("total="+total)


		var max = myArray(0)
		for( i <- 0 to (myArray.length - 1)) {
			if(myArray(i) > max){
				max = myArray(i);
			}
		}
		println("max="+max)

	}

	def multyDimension() = {
		var myMatrix = ofDim[Int] (5,6)

		var m = 4;
		var n = 5;

		for( i <- 0 to m) {
			for( j <- 0 to n) {
				myMatrix(i)(j) = i*j
			}
		}

		for( i <- 0 to m) {
			for( j <- 0 to n) {
				print("  " + myMatrix(i)(j))
			}

			println();
		}
	}

	def mergeArray()={
		var arr1 = Array(1.9, 2.9, 3.4, 4.5);
		var arr2 = Array(8.9, 2.3, 3, 2.0);

		var arr3 = concat(arr1, arr2);

		for( x <- arr3) {
			println(x)
		}
	}

	def rangeArr() = {
		var arr1 = range(10,20,2)
		var arr2 = range(10, 20)

		for( x <- arr1) {
			print(" "+x)
		}
		println()

		for(x <- arr2) {
			print(" " + x)
		}
		println()
	}
	
}