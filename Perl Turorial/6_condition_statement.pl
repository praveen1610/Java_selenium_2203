#if else statement
$a = 5;
if($a<10){
    print "inside if condition\n";
}
elsif($a<14)
{
    print "inside elsif condition\n";
}
else{
    
}
print "---------------------\n";
#Unless else statement
unless($a<10)
{
    print "inside unless condition\n";
}
else{
    print "inside unless else condition\n";
}
print "---------------------\n";

#Condition check with Operator  Exp1? Exp2:exp3
$status = $a<10 ? "value of a is less than 10" : "value of a is more than 10";
print "$status\n";