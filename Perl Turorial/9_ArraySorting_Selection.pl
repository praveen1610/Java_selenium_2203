#sorting of loops

=Sorting Selection sorting, This algorithm first 
finds the smallest element in the array and exchanges it with the element in the first position, 
then find the second smallest element and exchange
=cut

@inputarray = (5,8,8,1,26,32,63,1,23);
 $size = @inputarray;
 for($i=0; $i<$size; $i++)
 {
     for($j=$i+1; $j<$size; $j++)
     {
         if($inputarray[$i]>$inputarray[$j]){
             $a = $inputarray[$j];
             $inputarray[$j] = $inputarray[$i];
             $inputarray[$i]= $a;
              #print "@inputarray\n";               **Remove comment to under in detail**
              #print "$inputarray[$j], $inputarray[$i]\n";               **Remove comment to under in detail**
         }
         #print "$inputarray[$i], $inputarray[$j]\n";                **Remove comment to under in detail**
     }
 }
 print "@inputarray\n";
 
 