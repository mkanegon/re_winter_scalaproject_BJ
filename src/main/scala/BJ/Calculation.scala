package BJ

class Calculation {

  def sum_score (score1:Int,score2:Int):Int = {
    var sum = score1 + score2
    if (score1 == 1 | score2 == 1){
      sum += 10
    }
    sum
  }

}
