package com.edouardfouche.stats.external.Bivariate

import com.edouardfouche.index.NonIndex
import com.edouardfouche.stats.external.ExternalStats

trait BivariateStats extends ExternalStats {
  val id: String
  val calibrate:Boolean = false
  var parallelize:Int = 0
  type PreprocessedData = NonIndex

  def preprocess(input: Array[Array[Double]]): PreprocessedData = {
    if (get_dim(input)._1 != 2) throw new NumberFormatException("Bivariate Measure only accepts 2-D Data")
    else new NonIndex(input)
  }

  def contrast(m: PreprocessedData, dimensions: Set[Int]): Double = {
    val data: Array[Array[Double]] = Array(m(0), m(1))
    score(data)
  }

  def score(data: Array[Array[Double]], preRank: Array[Array[Int]] = null): Double

}
