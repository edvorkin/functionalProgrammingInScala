import java.util.Date

class Console (val make:String,val model:String, val debut:Date,
               val format:List[String],val resolution:Int,val wifi:String="N/A")  {
  override def toString=s"this is $make model: $model which debuted on $debut "
}

val a=new Console("xBox","350",new Date(),List("SD","MMC"),1920)
val b=new Console("playstation","5",new Date(),List("SD","MMC"),2420, "yes")


