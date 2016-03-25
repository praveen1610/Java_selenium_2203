#switch statemen

use Switch;

$argument_switch = 20;               #change vaule to run each case print
@array_input=(1,10,20,30);

switch($argument_switch){
    case 1                  { print "number 1\n"}
    case (\@array_input)    { print "number in array list\n"}
    case [1..10,42]         { print "number in list\n"}
    else                    { print "default case\n"}
}