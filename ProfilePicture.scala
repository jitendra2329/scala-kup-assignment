//import java.util.InputMismatchException
import scala.io.StdIn

object ProfilePicture extends  App {

  try {
    print("Enter the length of the square Frame : ")
    val lengthOfFrame: Int = StdIn.readInt()

    println("Enter the dimensions of the picture :  ")
    print("width : ")
    val width: Int = StdIn.readInt()
    print("height : ")
    val height: Int = StdIn.readInt()

    println(uploadProfilePicture(lengthOfFrame, width, height))
  } catch {
      case e : NumberFormatException =>{
        println("Please Enter numbers only !!")
      }
  }

  def uploadProfilePicture(lengthOfFrame: Int, width: Int, height: Int) : String = {

    if(width < lengthOfFrame || height < lengthOfFrame){
       "Upload another one"
    } else if (height == width) {
       "Accepted "
    } else {
       "CROP IT"
    }
  }
}
