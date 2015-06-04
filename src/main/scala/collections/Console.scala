package collections

import java.util.Date

/**
 * Created by dvorkine on 5/27/15.
 */
class Console (val make:String,val model:String, val debut:Date,
                val format:List[String],val resolution:Int,val wifi:String="N/A")  {
  override def toString=s"this is $make model: $model which debuted on $debut "
}
