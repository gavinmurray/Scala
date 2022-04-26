object forloopDemo {
       
   // Main Method
   def main(args: Array[String]) {
          
      var y = 0;
         
      // for loop execution with range
      for(y <- 1 to 4)
      {
         println("Value of y is: " + y);
      }


// while loop
       var x = 1;
   
        // Exit when x becomes greater than 4
        while (x <= 4)
        {
            println("Value of x: " + x);
   
            // Increment the value of x for
            // next iteration
            x = x + 1;
        }
   }
}