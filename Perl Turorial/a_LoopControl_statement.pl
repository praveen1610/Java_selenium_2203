#Next, Last, countinue, redo and goto are loop control statement

$a= 5;
while($a<10){
    
    if($a == 7){
        $a++; 
        next;
      }
        print "$a\n";
   $a++;     
}
print "--------------------\n";
#Next Using label
OUTER: while($a<13){
    print "vaue of a $a \n ";
    $b=0;
    INNER:while($b<4)
    {
        if($a==11)
        {
            $a=$a +1;# jump to outer loop
            next OUTER;
        }
        $b = $b+1;
        print "value of b: $b\n";
    }
    print "\n";
    $a = $a+1;
}
print "--------------------\n";
#Last
while($a<20){
    print "vaue of a $a \n ";
    if($a==17){
        last;
         }
         $a++;         
}
print "outside while loop vaue of a $a \n ";
print "--------------------\n";
#countinue & redo
$a =0;
while($a<5){
    print "Value of a = $a\n";
    if($a==3){
        $a = $a+1;
        redo;
    }
}continue{
    $a= $a+1;
    print "inside counti block\n";
}