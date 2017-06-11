object TestString {
	def main(args: Array[String]): Unit = {
		val greeting: String = "Hello World!"
		var hello = "Hello, I'm Ryan."

		println(greeting)
		println(hello)


		val buf = new StringBuilder;
		//追加字符
		buf += 'a'
		//追加字符串
		buf ++="bcdef"
		println("buf:" + buf.toString)


		//length
		println(greeting.length())

		testConcat()

		formatString()
	}

	def testConcat = () => {
		//concat
		var a = "Hello,"
		var b = " Ryan!"

		println(a.concat(b))

		val buf = new StringBuilder;
		buf ++= a;
		buf ++= b;
		println(buf.toString)

	}

	def formatString(): Unit = {
		var temp = printf("float is %f, integer is %d, string is %s", 12.123, 100, "test")
		println(temp)
	}
}