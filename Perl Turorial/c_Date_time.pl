@days = qw/sdf sfdf sdfsdf sdfsdf sdfsdf/;
print "@days\n";
print "$days[2]\n";
 
 
@months = qw( Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec );
@days = qw(Sun Mon Tue Wed Thu Fri Sat Sun);
 
($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime();
print "$mday $months[$mon] $days[$wday]\n";
 
$datestring = localtime();
print "local time is $datestring\n";
 
$gmtstring = gmtime();
print "gmt time is $gmtstring\n";