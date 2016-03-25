#transforming string to array
$inputString = "hello-world-never-ends-easiy";
$inputstring_2 = "praveen,kumar,prema,vetri,vel,jayabalan";

@array = split('-',$inputString);
@array_2 = split(',',$inputstring_2);
@array_2 = sort(@array_2);
$size = @array;

#for loop
for($i=0; $i<$size; $i++)
{
print "$array[$i]\n";
print "$array_2[$i]\n";    
}

#transforming array to string
$convertedString_2 = join('-',@array_2);
print "$convertedString_2\n";

$convertedString = join(',',@array);
print "$convertedString\n";