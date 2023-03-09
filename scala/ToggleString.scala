import scala.io.StdIn

object ToggleString extends App {

  def isValidString(inputString: String): Boolean = {

    var flag = 0

    try {
      for (index <- 0 until inputString.length ) {

        var character: Char = inputString.charAt(index)
        var characterIntValue: Int = character.toInt

        if (characterIntValue < 65 && characterIntValue != 32){
          flag = 1
          return false
        }
        else
          flag = 0
      }
    } catch {
        case e : StringIndexOutOfBoundsException => {
          println(e)
      }
    }
    if(flag == 1) false else true
  }

  /*Function calling for toggle string and taking the input from the user

   and verifying the is valid or not */
  val originalString : String = takeInput

  if(isValidString(originalString)) println(toggleString(originalString)) else println("Enter a valid String !!")

  //function for taking input from the user

  def takeInput: String = {
    print("Enter the String : ")
    StdIn.readLine()
  }

  //Function for toggling the string

  def toggleString(string: String): String = {
    var resultString = ""

    for (index <- 0 to string.length - 1) {

      if (string.charAt(index).toLower == string.charAt(index)) {
        resultString += string.charAt(index).toUpper
      } else {
        resultString += string.charAt(index).toLower
      }
    }
    resultString
  }
}
