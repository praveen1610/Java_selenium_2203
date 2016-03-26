use strict;


sub userinput{
    print "give ur input:";
    $a=<STDIN>;
    print "The given input is $a\n";
}

sub arrayinput{
    my @array;
    print "give ur Array size:";
    my $count = <>;
    print "give ur Array values:";
    while(@array < $count){ 
        my $num = <>;
        chomp $num;                 #chomp remove \n from the input
        push @array,$num;
    }
    print "@array";
    
}            

userinput();            #subroutine without argument
arrayinput();           #subroutine without argument to create array