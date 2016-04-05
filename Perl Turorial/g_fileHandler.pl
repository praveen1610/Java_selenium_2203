#!usr/bin/perl
#require to create a text file with name console.txt in location c:\selenium-2.50.0\\selenium-2.53.0\

$filelocation = "C:\\selenium-2.50.0\\selenium-2.53.0\\console.txt";
open(DATAS, ">>$filelocation") or die "open file failed,$!";  #appending data to file
print DATAS "a) first testing\n";
print DATAS "b) Second testing\n"; 
close DATAS;

open(DATAS_1, "<$filelocation") or die "open file failed,$!";
@lines = <DATAS_1>;   #reading and converting file to array
print $lines[2];
close DATAS_1;

open(DATAS_3, "<$filelocation") or die "open file failed,$!";
#while(<DATAS_3>)        #reading and printing the file line by line
#{
    #print "$_";
#}
open(DATAS_4, ">C:\\selenium-2.50.0\\selenium-2.53.0\\console_copy.txt") or die "open file failed,$!";   #appending data to file
while(<DATAS_3>)
{ 
    print DATAS_4 $_;
    
}
close (DATAS_3);
close (DATAS_4);

#Deleting a file
unlink("$filelocation");

#renaming the file name
rename("C:\\selenium-2.50.0\\selenium-2.53.0\\console_copy.txt", "C:\\selenium-2.50.0\\selenium-2.53.0\\console_new.txt");
