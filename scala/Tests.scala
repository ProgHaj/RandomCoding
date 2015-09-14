
object Test{

	def timerCallback(callback: Int => Unit){
		var x = 0
		while(true){callback(x);x+=1;Thread sleep 1000}
	}


	def main(args: Array[String]){
		timerCallback(fibonacci);
	}

	def fibonacci(n: Int){
		var i = 1
		var j = 0

		for(k <- 1 to n){
			var tmp = i
			i += j
			j= tmp
		}
		println(i)
		i
	}


}
