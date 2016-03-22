#!/usr/bin/perl

print "hello world\n";

=for($i=0;$i<3;$i++){
print "inside loop\n";
}
=cut  #commenting a para with =.....=cut

$var =<<"test";
This is the syntax for here document and it will continue
until it encounters a test in the first line.
This is case of double quote so variable value will be 
test
print "$var";

#Array Declaration with String and Interger
@ages = (25,50,56);
@name = ("john","praveen","tester");
$size = @name;
print "the size is $size\n";
print "$ages[2]\n";
print "$name[0]\n";

#Delaration with String and Interger
$age = 25;
$name = "praveen";
print "$age\n";
print "$name\n";
#test