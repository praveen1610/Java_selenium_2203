#Returning Value from a Subroutine

sub average{
my $n = scalar(@_); #local Variable
print "number if values inputed is $n\n";
 my $sum = 0;
 foreach $item(@_){
     $sum += $item;
     print"inputed value is $item\n";
 }
 $average = $sum /$count;
 return $average;
}

print "Give size of the array to find avaerage:\n";
$count = <>; #global Variable

print "Enter the array values:";
my @averagearray;

while(@averagearray < $count){
    $num = <>;
    chomp $num;
    push (@averagearray,$num);
}
print "@averagearray\n";

$num = average(@averagearray);
print "the average value is $num";