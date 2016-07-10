import java.io.*;
import java.util.*;
import java.lang.*;
public class Alpha
{
public static void main(String [] args)
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
ch=sc.nextChar();
if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
{
System.out.println("it is alphabet");
}
else
{
System.out.println("it is not an alphabet");
}
}
}
