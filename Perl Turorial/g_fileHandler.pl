#!usr/bin/perl
#C:\Users\User\workspace\TestNG\Notepad_reading_input.txt
$filelocation = "C:\\Users\\User\\workspace\\TestNG\\Notepad_reading_input";
open(DATAS, $filelocation) or die "open file failed,$!";

while(<DATAS>)
{
    print "$_";
}