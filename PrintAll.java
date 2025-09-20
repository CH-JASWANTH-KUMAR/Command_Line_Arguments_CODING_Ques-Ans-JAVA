// print all elements in arguments

// class PrintAll {
// public static void main(String[] args) {
// for (String val : args) {
// System.out.println(val);
// }
// }
// }

// ---------------------------------------------------------------------

// sum of all given numbers

// class PrintAll {
// public static void main(String[] args) {
// int a = 0;
// for (String val : args) {
// a += Integer.parseInt(val);
// }
// System.out.println(a);
// }
// }

// ----------------------------------------------------------------------------------

// count of argumnets

// class PrintAll {
// public static void main(String[] args) {
// int a = 0;
// for (String val : args) {
// a += 1;
// }
// System.out.println(a);
// }
// }

// ----------------------------------------------------------------------------------

// average of given numbers

// class PrintAll {
// public static void main(String[] args) {
// int a = 0, b = 0;
// for (String val : args) {
// a += Integer.parseInt(val);
// b += 1;
// }
// float c = (float) a / b;
// System.out.println(c);
// }
// }

// ------------------------------------------------------------------------------------

// no of even and odd numbers

// class PrintAll {
// public static void main(String[] args) {
// int a = 0, b = 0;
// for (String val : args) {
// if (Integer.parseInt(val) % 2 == 0) {
// a += 1;
// } else {
// b += 1;
// }
// }
// System.out.println("no of even numbers: " + a + " And " + "no of odd numbers:
// " + b);

// }
// }

// --------------------------------------------------------------------------------------------------------

// finding min and max

// class PrintAll {
// public static void main(String[] args) {
// int a = Integer.parseInt(args[0]);
// int b = Integer.parseInt(args[0]);

// for (int i = 0; i < args.length; i++) {
// int num = Integer.parseInt(args[i]);
// if (num > a) {
// a = num;
// }
// if (num < a) {
// b = num;
// }
// }
// System.out.println("max :" + a + " min :" + b);
// }
// }

// 2nd method(using different for loop)

// class PrintAll {
// public static void main(String[] args) {
// int a = Integer.parseInt(args[0]);
// int b = Integer.parseInt(args[0]);

// for (String val : args) {
// int num = Integer.parseInt(val);
// if (num > a) {
// a = num;
// }
// if (num < a) {
// b = num;
// }
// }
// System.out.println("max :" + a + " min :" + b);
// }
// }

// --------------------------------------------------------------------------

// prime or notprime number

// class PrintAll {
// public static void main(String[] args) {
// for (String val : args) {
// int num = Integer.parseInt(val);
// if (isprime(num)) {
// System.out.println(num + " is a prime number");
// } else {
// System.out.println(num + " is not a prime number");
// }
// }
// }

// static boolean isprime(int n) {
// if (n <= 1) {
// return false;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0)
// return false;
// }
// return true;
// }
// }

// -------------------------------------------------------------------------------------

// reverse the order of arguments

// class PrintAll {
// public static void main(String[] args) {
// for (int i = args.length - 1; i >= 0; i--) {
// System.out.println(args[i]);
// }
// }
// }

// -------------------------------------------------------------------------------------

// check if word exists

// class PrintAll {
// public static void main(String[] args) {
// for (String val : args) {
// if (val.equals("Found")) {
// System.out.println("Word exists");
// }
// }
// }
// }

// -------------------------------------------------------------------------------------------

// Product of numbers

// class PrintAll {
// public static void main(String[] args) {
// int a = 1;
// for (String val : args) {
// a *= Integer.parseInt(val);
// }
// System.out.println(a);
// }
// }

// -----------------------------------------------------------------------------------------------

// print arguments greater than a given value

// class PrintAll {
// public static void main(String[] args) {
// int z = 5;
// for (String val : args) {
// if (Integer.parseInt(val) > z) {
// System.out.println(val);
// }
// }
// }
// }

// -------------------------------------------------------------------------------------------------------

// accept name and age

// class PrintAll {
// public static void main(String[] args) {
// System.out.println(" Hello " + args[0] + " you are " + args[1] + " years old
// ");
// }
// }

// ------------------------------------------------------------------------------------------------------------

// check if arguments are palindrome or not

// class PrintAll {
// public static void main(String[] args) {
// String con = "";
// int ans = 0;
// for (String val : args) {
// String a = val + con;
// int num = Integer.parseInt(a);
// int b = num % 10;
// ans = ans * 10 + b;
// b = b / 10;
// if (ans == num) {
// System.out.println("the given number is a palindrome");
// }
// if (ans != num) {
// System.out.println("the given number is not palindrome");
// }
// }
// }
// }

// --------------------------------------------------------------------------------------

// print arguments that are palindromes

// class PrintAll {
// public static void main(String[] args) {
// for (String val : args) {
// int num = Integer.parseInt(val);
// int original = num;
// int reversed = 0;

// while (num != 0) {
// int digit = num % 10;
// reversed = reversed * 10 + digit;
// num /= 10;
// }

// if (original == reversed) {
// System.out.println(original + " is a palindrome");
// } else {
// System.out.println(original + " is not a palindrome");
// }
// }
// }
// }

// -------------------------------------------------------------------

// 15) print the longest argument

// public class PrintAll {
// public static void main(String[] args) {
// String longarg = args[0];
// for (int i = 1; i < args.length; i++) {
// if (args[i].length() > longarg.length()) {
// longarg = args[i];
// }
// }
// System.out.println(longarg);
// }
// }

// --------------------------------------------------------------------

// 16) sum even num only

// class PrintAll {
// public static void main(String[] args) {
// int sum = 0;
// for (String val : args) {
// if (Integer.parseInt(val) % 2 == 0) {
// sum += Integer.parseInt(val);
// }
// }
// System.out.println(sum);
// }
// }

// ------------------------------------------------------------

// 17) check whether the string starts with capital letter

// public class PrintAll {
// public static void main(String[] args) {
// for (String val : args) {
// if (!val.isEmpty() && Character.isUpperCase(val.charAt(0))) {
// System.out.println(val);
// }
// }
// }
// }

// ----------------------------------------------------------------

// 18) Print all arguments at prime indices

// public class PrintAll {
// public static void main(String[] args) {
// for (int i = 2; i < args.length; i++) {
// if (isprime(i)) {
// System.out.println(args[i]);
// }
// }
// }

// public static boolean isprime(int num) {
// if (num < 2) {
// return false;
// }
// for (int j = 2; j <= Math.sqrt(num); j++) {
// if (num % j == 0) {
// return false;
// }
// }
// return true;
// }
// }

// ---------------------------------------------------------------------

// 19) sum of squares of arguments

// class PrintAll {
// public static void main(String[] args) {
// int sum = 0;
// for (String val : args) {
// int num = Integer.parseInt(val);
// sum += num * num;
// }
// System.out.println(sum);
// }
// }

// -----------------------------------------------------------

// 20) usage instructions if no arguments are given

// class PrintAll {
// public static void main(String[] args) {
// if (args.length == 0) {
// System.out.println("Usage: no arguments provided,please provide some
// arguments");
// } else {
// for (String val : args) {
// System.out.println(val);
// }
// }

// }
// }

// ------------------------------------------------------------------------------------------------
