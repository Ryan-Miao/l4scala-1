
/**
	* http://www.runoob.com/scala/scala-lists.html
	*
	*/
object TestList {
	def main(args: Array[String]): Unit = {
		//List是不可变的链式list，重新赋值会像String一样返回一个新的
		val site: List[String] = List("baidu","google","expedia")
		val nums: List[Int] = List(1, 2, 3, 4)
		val empty: List[Nothing] = List()

		val dim: List[List[Int]] = List(
				List(1, 0, 0),
				List(0, 1, 0),
				List(0, 0, 1)
			)

		nilList()

		handleList()

		concatList()

		repeatEle()

		tabulateList()

		reverseList()

		listApi()
	}

	def nilList() = {
		val site = "baidu" :: ("google" :: ("expedia":: Nil))
		val nums = 1 :: (2 :: (3:: (4 :: Nil)))
		val empty = Nil
		val dim = (1 :: (0 :: (0 :: Nil))) ::
					(0 :: (1 :: (0 :: Nil))) ::
					(0 :: (0 :: (1 :: Nil))) :: Nil
	}

	def handleList() = {
		val site: List[String] = List("baidu","google","expedia")
		val nums = Nil

		println("head=" + site.head) 
		println("tail=" + site.tail) 
		println("check is empty=" + site.isEmpty)
		println("check is null=" + nums.isEmpty)
	}

	def concatList() = {
		val site1 = "baidu" :: ("tencent" :: ("taobao" :: Nil))
		val site2 = "facebook" :: ("apple":: Nil)

		var fruit = site1 ::: site2
		println("site1 ::: site2 = " + fruit)

		fruit = site1.:::(site2)
		println("site1.:::(site2) = " + fruit)

		fruit = List.concat(site1, site2)
		println("List.concat(site1, site2) = " + fruit)

	}

	def repeatEle() = {
		val site = List.fill(3)("baidu")
		println("site = " + site)

		val num = List.fill(10)(2)
		println("num = " + num)

	}

	def tabulateList() = {
		//通过给定的函数创建5个元素
		val squares = List.tabulate(6)(n => n *n)
		println("一维：" + squares)

		val mul = List.tabulate(4, 5)( _ * _)
		println("多维: " + mul)
	}

	def reverseList() = {
		val site = "baidu" :: ("tencent" :: ("alibaba" :: Nil))
		println("site before=" + site)

		println("site after reverse=" + site.reverse)
	}

	/**
	* List是Immutable 类型，添加后的list都是复制的，原来的对象不变
	**/
	def listApi() = {

		//向前追加
		val x = List(1)
		val y = 2 +: x
		println("y="+y)
		println("x="+x)

		//向前追加
		val z = 3 :: x
		println("z="+z)
		println("x="+x)

		//拼接
		val list1 = List(1,2)
		val list2 = List(3,4)
		val list3 = list1 ::: list2
		println("list3=" + list3)

		//向后追加
		val a = x :+ 2
		println("a=" + a)
		println("x=" + x)

		val list = List(1,2,3,6, 4,5)

		//join
		var builder = new StringBuilder
		var builder2 = list.addString(builder)
		println(builder.toString)
		println(builder2.toString)
		println(builder2 == builder)

		val joinBuilder = list.addString(new StringBuilder, ",");
		println("join , :"+joinBuilder.toString())

		println("list mkString:" + list.mkString)
		println("list mkString by:" + list.mkString(","))


		println(list.contains(1))

		//cp to Array
		var arr = new Array[Int](5)
		list.copyToArray(arr, 0 , 5);
		for(i <- arr){
			printf(" " + i)
		}
		println()

		val array = list.toArray
		println("list toArray:" + array)
		for(i <- array){
			print(" " + i)
		}
		println()


		//get one
		println("The first one = "+list.apply(0))
		println("The index one = " + list(0))

		//distinct
		var duplicatedList = List(1, 2, 3, 4, 1, 3, 2)
		println("duplicatedList = " + duplicatedList)
		println("distinct list = " + duplicatedList.distinct)

		//drop left
		println("list = " + list)
		println("drop left 2= " + list.drop(2))
		//drop right
		println("list = " + list)
		println("drop right 2= " + list.dropRight(2))

		//def dropWhile(p: (A) => Boolean): List[A]
		//从头开始，依次删除符合条件的元素，直到遇到第一个不满足条件的元素终止，将后续的元素复制返回
		val conditionList = list.dropWhile(_ < 3)
		println("condition list = " +conditionList)

		//def endsWith[B](that: Seq[B]): Boolean
		//检测列表是否以指定序列结尾
		println("endsWith list :"+list.endsWith(List(4,5)))
		println("startsWith list:" + list.startsWith(List(1)))

		val cpList = List(1,2,3,4,5)
		println( "cp list == list : " + (cpList == list))
		println("cp list equals list :" + cpList.equals(list))

		/**
			* def exists(p: (A) => Boolean): Boolean
				判断列表中指定条件的元素是否存在。
				判断l是否存在某个元素:
			*/
		println(list.exists(_ >= 5))

		/**
			* def filter(p: (A) => Boolean): List[A]
				输出符号指定条件的所有元素。
			*/
		println(list.filter(_ % 2 == 0))

		/**
			* def forall(p: (A) => Boolean): Boolean
				检测所有元素。
			*/
		println(list.forall(_>1))

		/**
			* def foreach(f: (A) => Unit): Unit
				将函数应用到列表的所有元素
			*/
		println("list foreach:")
		list.foreach(i => print(" " + i))
		println()

		/**
			* def head: A
				获取列表的第一个元素
			*/
		println("head:"+list.head)
		println("last:"+list.last)
		println("list length: " + list.length)
		println("list max:" + list.max)
		println("list min:" + list.min)
		println("list sum:" + list.sum)

		/**
			* def indexOf(elem: A, from: Int): Int
				从指定位置 from 开始查找元素第一次出现的位置
			*/
		println("3 从下标为0开始查找，第一次出现的位置: "+list.indexOf(3, 0))
		println("2 从下表为end开始查找，最后出现的位置：" + list.lastIndexOf(4, 4))

		/**
			* def init: List[A]
				返回所有元素，除了最后一个
			*/
		println("除了最后一个："+list.init)
		println("除了第一个："+list.tail)

		/**
			* def intersect(that: Seq[A]): List[A]
				计算多个集合的交集
			*/
		println("交集：" + list.intersect(List(1, 3, 6)))
		/**
			* def isEmpty: Boolean
				检测列表是否为空
			*/
		println("isEmpty: "+list.isEmpty)

		/**
			* def iterator: Iterator[A]
				创建一个新的迭代器来迭代元素
			*/
//		list.iterator

		println("list map:" + list.map(a => a-1))

		println("list sorted:"+list.reverse.sorted)


		/**
			* def take(n: Int): List[A]
				提取列表的前n个元素
			*/
		println("list take:" + list.take(2))

		println("list takeRight:" + list.takeRight(2))



	}



}