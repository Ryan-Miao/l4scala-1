object TestFunP3 {
	def main(args: Array[String]) {
		printStrings("Java", "Scala", "Stom", "Kafka");
	}

	def printStrings( args: String*) = {
		var i: Int = 0;
		for (arg <- args){
			println("Arg value[" + i + "]=" + arg);
			i = i + 1;
		}
	}
}