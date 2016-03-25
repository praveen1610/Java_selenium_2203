#Bubble Sort compares all the element one by one and sort them based on their values
#Each iteration the smaller element in the list bubbles up towards the first place, 
#just like a water bubble rises up to the water surface.

@inputarray = (5,8,8,1,26,32,63,1,23);
 $size = @inputarray;
 print "size of the array is $size\n";
 for($i=0; $i<$size; $i++){
     for($j=0; $j<$size-$i-1 ; $j++) {
        # print "---------------$inputarray[$j], $inputarray[$j+1]\n"; 
         if($inputarray[$j] > $inputarray[$j+1]){
            # print "$inputarray[$j], $inputarray[$j+1]\n"; 
             $a = $inputarray[$j];
             $inputarray[$j] = $inputarray[$j+1];
             $inputarray[$j+1]= $a;
         #     print "@inputarray\n";
         }
         
     } 
      #print "  @inputarray\n";
 }
 print "@inputarray\n";
 