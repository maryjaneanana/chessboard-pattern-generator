package chessboard.pattern.generator;

import java.util.Scanner;

public class Chessboard {
public static void main(String[] args) {
char[][] chessboard = new char[8][8];

Scanner scanner = new Scanner(System.in);

System.out.println ("====== CHESSBOARD PATTERN GENERATOR ======");
System.out.println("");
System.out.println("");

System.out.print("Enter the column coordinates: ");
char column = scanner.next().charAt(0);
System.out.print("Enter the row coordinates: ");
int row = scanner.nextInt();

switch (column) {
case 'a': case 'c': case 'e': case 'g':
if (row % 2 == 0)
 System.out.println(column + "" + row + "  is white block");
else
 System.out.println(column + "" + row + "  is black block");
break;
case 'b': case 'd': case 'f': case 'h':
if (row % 2 == 0)
System.out.println(column + "" + row + "  is black block");
else
System.out.println(column + "" + row + "  is white block");
break;
default:
System.out.println("Invalid column coordinates");
break;
}
}
}
