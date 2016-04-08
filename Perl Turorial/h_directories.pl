#!/usr/bin/perl
# Display all the files in /tmp directory.

$dir = "c:/*.sys";    #will display all files with extension .sys
my @files = glob( $dir );
foreach (@files ){
    print $_ . "\n";
}

#list all the folder and file in a location
opendir(DIR,'c:/') or die "could not open the directory -$!";
while ($file = readdir DIR){
    print "$file\n"
}
closedir DIR;


$newdir = "C:/testerdirec";
mkdir($newdir);   #create new file use rmdir($newdir) to remove the directory

chdir($newdir);
open(newfile,">newfile");
print newfile "testing";
close newfile;