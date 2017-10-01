import com.spark.sample.MyTableRead
import com.spark.sample.common.SparkMain

/**
  * Created by ssharma on 10/1/17.
  */
object Driver extends SparkMain{
  def main(args: Array[String]): Unit = {
    val myTableRead = new MyTableRead()
    myTableRead.createAndInsertIntoTable("MyTest")
    val dataFrame = myTableRead.queryTable("MyTest")
    dataFrame.collect.foreach(println)
  }
}
