package BJ
import com.sun.xml.internal.bind.api.impl.NameConverter.Standard

import scala.util.control.Breaks

class Judge {

  def s_or_h ():Int = {
    var c = 0

    val s_h = io.StdIn.readLine()

    if (s_h == "Stand") {
      c = 1
    }
    c
  }:Int

}
