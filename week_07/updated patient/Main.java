import java.util.HashSet; import java.util.Objects; import java.util.Set;
public class Main {
     public static void main(String[] args) {
Patient p1 = new Patient();
Patient p2 = new Patient();
Patient p3 = new Patient("Prime", "Minister", 123);
System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
System.out.println(p1.equals(p1));
System.out.println(p1.equals(p2));
System.out.println(p1.equals(p3));
Patient s1 = new Patient("Sara", "Khan", 101);
Patient s2 = new Patient("Sara", "Khan", 101);
System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
System.out.println("s1 == s2 : " + (s1 == s2));
System.out.println("s1.equals(s2) : " + s1.equals(s2));
System.out.println("sara 1 hash code : " + s1.hashCode());

System.out.println("sara 2 hash code : " + s2.hashCode());

//without  overriding equals but we override hash

System.out.println("s1.equals(s2) : " + s1.equals(s2));


System.out.println("xxxxxxxxxxxx JFC: Hash-Set xxxxxxxxxxxxxxxxxxxxx");
Set<Patient> patients = new HashSet<>();
patients.add( s1); patients.add( s2);
System.out.println("HashSet size : " + patients.size());
Patient searchPatient = new Patient("Sara", "Khan", 101);
System.out.println(
"Patient found : " + patients.contains(searchPatient));
System.out.println("xxxxxxxxxxxxxx Hash-code xxxxxxxxxxxxxxxxxxxxxxx");
} }