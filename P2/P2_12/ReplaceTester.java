public class ReplaceTester

{public static void main(String [] args)

{
String abc = new String();
String xyz = ("Expected ");
abc = ("Mississippi");
System.out.print(xyz);
System.out.println(abc);
abc = abc.replace('s','$');
System.out.print(xyz);
abc  = abc.replace('i','!');
System.out.println(abc);
}

}