
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
    print "The given input is $a,\n";
}
$handlerref = \&userinput;

&$handlerref;
print "its reference type is ", ref($handlerref),"\n";