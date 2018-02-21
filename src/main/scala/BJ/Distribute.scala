package BJ

class Distribute {
  def mark_num (number:Card): Unit = {number match {
    case Card(0) => print("♠1")
    case Card(1) => print("♠2")
    case Card(2) => print("♠3")
    case Card(3) => print("♠4")
    case Card(4) => print("♠5")
    case Card(5) => print("♠6")
    case Card(6) => print("♠7")
    case Card(7) => print("♠8")
    case Card(8) => print("♠9")
    case Card(9) => print("♠10")
    case Card(10) => print("♠11")
    case Card(11) => print("♠12")
    case Card(12) => print("♠13")
    case Card(13) => print("☘1")
    case Card(14) => print("☘2")
    case Card(15) => print("☘3")
    case Card(16) => print("☘4")
    case Card(17) => print("☘5")
    case Card(18) => print("☘6")
    case Card(19) => print("☘7")
    case Card(20) => print("☘8")
    case Card(21) => print("☘9")
    case Card(22) => print("☘10")
    case Card(23) => print("☘11")
    case Card(24) => print("☘12")
    case Card(25) => print("☘13")
    case Card(26) => print("♡1")
    case Card(27) => print("♡2")
    case Card(28) => print("♡3")
    case Card(29) => print("♡4")
    case Card(30) => print("♡5")
    case Card(31) => print("♡6")
    case Card(32) => print("♡7")
    case Card(33) => print("♡8")
    case Card(34) => print("♡9")
    case Card(35) => print("♡10")
    case Card(36) => print("♡11")
    case Card(37) => print("♡12")
    case Card(38) => print("♡13")
    case Card(39) => print("♢1")
    case Card(40) => print("♢2")
    case Card(41) => print("♢3")
    case Card(42) => print("♢4")
    case Card(43) => print("♢5")
    case Card(44) => print("♢6")
    case Card(45) => print("♢7")
    case Card(46) => print("♢8")
    case Card(47) => print("♢9")
    case Card(48) => print("♢10")
    case Card(49) => print("♢11")
    case Card(50) => print("♢12")
    case Card(51) => print("♢13")
    case _        => print("JOKER")
  }
  }:Unit

 def get_num () : Int = {
   val random_num = new java.util.Random().nextInt(52)
   random_num
 }: Int

 def score_giv (num : Card): Int = {num match {
   case Card(0|13|26|39) => 1
   case Card(1|14|27|40) => 2
   case Card(2|15|28|41) => 3
   case Card(3|16|29|42) => 4
   case Card(4|17|30|43) => 5
   case Card(5|18|31|44) => 6
   case Card(6|19|32|45) => 7
   case Card(7|20|33|46) => 8
   case Card(8|21|34|47) => 9
   case _                => 10
     }
 }: Int

}
