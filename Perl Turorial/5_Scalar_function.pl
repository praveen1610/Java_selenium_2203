#!/usr/bin/perl
$module = 5%2;
print "module value is $module\n";

$input = "prav"."kumar";  #concatenation
print "$input \n";

$addition = 5 + 5;
print "5+5=$addition \n";

$multi = 4 * 4;
print "4*4=$multi \n";

$poweroff = 5**2;
print "5 power 2 = $poweroff\n";

#scalar operator
$opertor= 6<=>6;
print "both value equal $opertor\n";

$opertor_1= 6<=>10;
print "$opertor_1\n";

$opertor_2= 10<=>6;
print "$opertor_2\n";

print "line number is " . __LINE__."\n";   #will display the current line number
print "Package ".__PACKAGE__."\n";         #Will display the program package