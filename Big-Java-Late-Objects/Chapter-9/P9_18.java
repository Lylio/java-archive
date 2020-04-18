
/**
 * P9.18 The System.out.printf method has predefined formats for printing integers, floatingpoint
numbers, and other data types. But it is also extensible. If you use the S format,
you can print any class that implements the Formattable interface. That interface has a
single method:
void formatTo(Formatter formatter, int flags, int width, int precision)
In this exercise, you should make the BankAccount class implement the Formattable
interface. Ignore the flags and precision and simply format the bank balance, using
the given width. In order to achieve this task, you need to get an Appendable reference
like this:
Appendable a = formatter.out();
Appendable is another interface with a method
void append(CharSequence sequence)
CharSequence is yet another interface that is implemented by (among others) the String
class. Construct a string by first converting the bank balance into a string and then
padding it with spaces so that it has the desired width. Pass that string to the append
method.
 * @author Lyle
 *
 */
public class P9_18 {

	public static void main(String[] args) {
		

	}

}
