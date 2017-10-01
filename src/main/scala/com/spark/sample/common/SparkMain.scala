package com.spark.sample.common

import java.io.File

import org.apache.spark.sql.SparkSession

/**
  * Created by ssharma on 10/2/17.
  */
trait SparkMain {
  implicit val sQLContext = SparkMain.spark.sqlContext
}

object SparkMain {
  val warehouseLocation = new File("spark-warehouse").getAbsolutePath

  val spark = SparkSession
    .builder()
    .appName("Spark Hive Example")
    .config("spark.sql.warehouse.dir", warehouseLocation)
    .master("local")
    .enableHiveSupport()
    .getOrCreate()
}
