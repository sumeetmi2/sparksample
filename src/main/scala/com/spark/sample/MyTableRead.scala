package com.spark.sample

import org.apache.spark.sql.{DataFrame, SQLContext, SaveMode}

/**
  * Created by ssharma on 10/1/17.
  */
class MyTableRead (implicit sQLContext: SQLContext){

  import sQLContext.implicits._

  def createAndInsertIntoTable(tableName: String) = {
    val seq = Seq(1, 3, 2, 4, 100)
    sQLContext.sparkContext.parallelize(seq).toDF("numbers")
      .write.mode(SaveMode.Overwrite).saveAsTable(tableName)
  }

  def queryTable(tableName: String): DataFrame = {
      sQLContext.sql(s"select * from $tableName")
  }
}
