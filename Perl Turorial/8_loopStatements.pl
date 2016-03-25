#For loop Statement
$a= 5;
for($i=0; $i<=$a; $i++){
    print "value of i is $i\n";
}

print "--------------------\n";
#While loop Statement - runs until the condition is true
while($a<10)
{
    print "Value of a is $a \n";
    $a++;
}

print "--------------------\n";
#Until loop Statement - runs until the condition is false
until($i>10)
{
    print "value of i is $i \n";
    $i++;    
}

print "--------------------\n";
#foreach loop - foreach var(list)
@list = (1,3,4);
foreach $a(@list)
{
    print "value of a: $a \n";
}
print "--------------------\n";
#do while
do{
    print "inside do loop $a\n";
    $a++;
}while($a<18)