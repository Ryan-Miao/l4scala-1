import java.util.Date
object TestFunLoss {
	def main(args: Array[String]): Unit = {
		val date = new Date
		log(date, "test 1")

		Thread.sleep(1000)

		log(date, "test 2")

		Thread.sleep(1000)

		log(date, "test 3")


		//------------------
		val logWithDateBound = log(date, _: String)
		logWithDateBound("bound 1")
		Thread.sleep(1000)
		logWithDateBound("bound 2")
		Thread.sleep(1000)
		logWithDateBound("bound 3")
		Thread.sleep(1000)
	}

	def log(date: Date, message: String) = {
		println(date + "---" + message)
	}
}