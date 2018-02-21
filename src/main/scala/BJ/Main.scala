package BJ
case class Card(number:Int)

object Main extends App{

  var dist = new Distribute
  var calc = new Calculation
  var judge = new Judge

  var handsa = Card(dist.get_num())
  var handsb = Card(dist.get_num())

  if(handsa.equals(handsb)) {
    handsb = Card(dist.get_num())
  }

  var handsArray = Array(handsa,handsb)

  println("        player")
  print("Hands:  ")
  dist.mark_num(handsa)
  dist.mark_num(handsb)
  println("")
  print("total:  "+ calc.sum_score(dist.score_giv(handsa),dist.score_giv(handsb))+"\n")
  println(" Stand  or  Hit ")
  print("player:")
  var sh = judge.s_or_h()

  while (sh != 0){
    println("       player")
    print("Hands:  ")

  }




  /*ForcedTermination.breakable(
  do {
    print("prayer: prayer1  prayer2\ncards:  ")
    distribute(p1handsa)
    distribute(p1handsb)
    print("    ")
    distribute(p2handsa)
    distribute(p2handsb)
    println("")
    print("total:  " + sumcalc(score(p1handsa), score(p1handsb)))
    print("       " + sumcalc(score(p2handsa), score(p2handsb)))
    println("")
    var MJ = MasterJudge(sumcalc(score(p1handsa), score(p1handsb)))_
    MJ(sumcalc(score(p2handsa), score(p2handsb)))
    println("Stand  or  Hit")
    print("prayer1:")
    NT1 = SorH()
    print("prayer2:")
    NT2 = SorH()
    if(NT1 == 0) {
      Hit()
    }
    if(NT2 == 0) {
      Hit()
    }
  } while(NT1 != 1 | NT2 !=1)

  )--------------------------------------------------------------------------------------------------------
  */
}
