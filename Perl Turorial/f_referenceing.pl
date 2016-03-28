
$var = 10;
#now Scalarref has reference to $var scalar
$scalarref = \$var;
print "$$scalarref and its reference type is ", ref($scalarref),"\n";

#now arrayrefe has reference to $array array
@array=(1,6,5);
$arrayrefe = \@array;
print "@$arrayrefe and its reference type is ", ref($arrayrefe),"\n";

sub userinput{
    print "give ur input:";
    $a=<STDIN>;
    chomp $a;
    print "The given input is $a\n";
}
$handlerref = \&userinput;

&$handlerref;
print "its reference type is ", ref($handlerref),"\n";

=Output will be as follows 
10 and its reference type is SCALAR
1 6 5 and its reference type is ARRAY
give ur input:5
The given input is 5,
its reference type is CODE
=cut
