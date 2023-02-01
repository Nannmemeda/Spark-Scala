package com.sundogsoftware.spark

import org.apache.spark._
import org.apache.log4j._

object RatingCounter {

  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    // Create a SparkContext using every core of the local machine, named RatingCounter
    val sc = new SparkContext("local[*]", "RatingCounter")

    // Load each line of the rating data into rdd
    val lines = sc.textFile("data/ml-100k/u.data")

    // Convert each line to a string, split it out by tabs, and extract the third field.
    // (The file format is userID, movieID, rating, timestamp)
    val ratings = lines.map(x => x.split("\t")(2))

    // Count how many times each rating occurs
    val results = ratings.countByValue()

    // Sort the resulting map of (rating, count) tuples
    val sortedResults = results.toSeq.sortBy(_._1)

    // Print each result on its own line
    sortedResults.foreach(println)
  }
}
