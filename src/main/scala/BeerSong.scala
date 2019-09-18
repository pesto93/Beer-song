object BeerSong extends App {
  def recite(num_bottles: Int, verse: Int): String ={
    val sb = new StringBuilder
    var new_num_bottle = num_bottles
    var my_new_bottle = num_bottles
    var new_verse = verse
    new_verse -= 1

    if(num_bottles != 0){
      for (i <- 0 until verse ){
        if(new_num_bottle == 1){
          new_num_bottle -= 1
          sb.append(s"$my_new_bottle bottle of beer on the wall, $my_new_bottle bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
          my_new_bottle -= 1
        }
        else if(new_num_bottle == 0){
          new_num_bottle -= 1
          sb.append("\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n")
        }
        else{
          new_num_bottle -= 1
          if(new_num_bottle == 1){
            sb.append(s"$my_new_bottle bottles of beer on the wall, $my_new_bottle bottles of beer.\nTake one down and pass it around, $new_num_bottle bottle of beer on the wall.\n")
          }else{
            sb.append(s"$my_new_bottle bottles of beer on the wall, $my_new_bottle bottles of beer.\nTake one down and pass it around, $new_num_bottle bottles of beer on the wall.\n")
          }
          if(i != new_verse){
            sb.append("\n")
          }
          my_new_bottle -= 1
        }
      }
      sb.toString // return sb.
      }else{
      "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n" // return this if bottle is 0
      }
    }

//  print(recite(2, 3)) call the function here.
}