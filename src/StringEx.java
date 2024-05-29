class StringEx
 {
 public static void main(String args[])
 {
 String s1="This is a String Class";
 System.out.println("Length :"+ s1.length());
 System.out.println("Charactr at :" + s1.charAt(0));
 int start=10;
 int end=14;
 char c[]=new char[end-start];
 s1.getChars(start,end,c,0);
 System.out.println(c);
 System.out.println("UpperCase :"+s1.toUpperCase());
 System.out.println("LowerCase :"+s1.toLowerCase());
 System.out.println("IndexOf :"+s1.indexOf('a'));
 System.out.println("Last Index Of"+s1.lastIndexOf('a'));
 System.out.println("Java".compareTo("java") );
 String s2=" Java ";
 if((s1.startsWith("This"))&&(s1.endsWith("Class")))
   System.out.println("Java");
 else
   System.out.println("C");
 String temp = s1.substring(0,4);
 System.out.println("Temp="+temp);
 String st1="Java";
 String st2 = st1.replace('J','G');
 System.out.println ("New String="+st2);
 }
 } 