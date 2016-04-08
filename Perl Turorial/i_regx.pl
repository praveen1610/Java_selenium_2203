#!/usr/bin/perl

$bar = "This is praveen and again praveen";
if($bar =~ m/praveen/){
    print "Praveen found in \$bar\n";
}else{
    print "praveen not found";
}

#matching variables
#$bar_1 = "This is praveen and again praveen";
$bar =~ m/praveen/;
print "Text before:  $`\n";      # $`
print "Text Matched: $&\n";      # $&
print "Text AFTER matched:  $'\n";       # $'

#substitution operator
$bar =~ s/praveen/tamilan/;
print "$bar\n";

#Translation Operator
$bar_1 = "This is pravezn and again pravezn";
$bar_1 =~ tr/pravezn/kumatgb/;
print "$bar_1\n";
$bar_1 =~ tr/a-z/A-Z/;
print "$bar_1\n";

#Grouping Matching
$time ="12:05:30";
$time =~ m/(\d+):(\d+):(\d+)/;
my ($hours, $min, $sec) = ($1,$2,$3);
print "Hours: $hours, Minutes: $min, Second: $sec";