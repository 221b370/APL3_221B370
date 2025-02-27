/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Lazy s1 = Lazy.getInstance();
		Lazy s2 =  Lazy.getInstance();
                System.out.println(s1.hashCode());
                System.out.println(s2.hashCode());
		
	}
}
