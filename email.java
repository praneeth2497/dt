import java.util.*;


class Email


{
public static void main(String[] args)


{


String email;


int i,small=0,capital=0,numbers=0,special=0;


char ch[]=new char[40];


Scanner s=new Scanner(System.in);


System.out.println("Enter Email");
email=s.nextLine();


ch=email.toCharArray();


System.out.println(ch);
for(i=0; i<email.length();i++)


{
if(ch[i]>='a'&&ch[i]<='z')


{


small++;


}


else


if(ch[i]>='A'&&ch[i]<='Z')


{


capital++;


}


else


if(ch[i]>='1'&&ch[i]<='9')


{


numbers++;


}


else


{


special++;


}
}
System.out.println("small letters="+small);


System.out.println("capital letters="+capital);


System.out.println("numbers="+numbers);


System.out.println("special characters="+special);
}


}

