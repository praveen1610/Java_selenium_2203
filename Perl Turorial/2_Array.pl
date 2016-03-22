#!usr/bin/perl

#Array push n pop

@names = ("test","praveen","kumar");
print "Input given: @names\n";

push(@names,"venu");
print "After pushing added one element from last: @names\n";

pop(@names);
print "After pop removed one element from last: @names\n";

shift(@names);
print "After shift removed one element from front: @names\n";

unshift(@names,"testing");
print "After unshift Added one element in front: @names\n";

#slicing Array 
@sliced=@names[2,1];
print "sliced: @sliced\n";

#array size
$size = @names;
print "The array size is $size \n";