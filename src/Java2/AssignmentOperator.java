package Java2;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // b is assigned the value of a
        System.out.println("Value of b: " + b);

        // Addition Assignment Operator (+=)
        int c = 5;
        c += 3; // Equivalent to: c = c + 3
        System.out.println("Value of c after addition: " + c);

        // Subtraction Assignment Operator (-=)
        int d = 8;
        d -= 2; // Equivalent to: d = d - 2
        System.out.println("Value of d after subtraction: " + d);

        // Multiplication Assignment Operator (*=)
        int e = 4;
        e *= 6; // Equivalent to: e = e * 6
        System.out.println("Value of e after multiplication: " + e);

        // Division Assignment Operator (/=)
        int f = 18;
        f /= 3; // Equivalent to: f = f / 3
        System.out.println("Value of f after division: " + f);

        // Modulus Assignment Operator (%=)
        int g = 17;
        g %= 5; // Equivalent to: g = g % 5
        System.out.println("Value of g after modulus: " + g);

        // Bitwise AND Assignment Operator (&=)
        int h = 12;
        h &= 6; // Equivalent to: h = h & 6
        System.out.println("Value of h after bitwise AND: " + h);

        // Bitwise OR Assignment Operator (|=)
        int i = 9;
        i |= 3; // Equivalent to: i = i | 3
        System.out.println("Value of i after bitwise OR: " + i);

        // Bitwise XOR Assignment Operator (^=)
        int j = 15;
        j ^= 6; // Equivalent to: j = j ^ 6
        System.out.println("Value of j after bitwise XOR: " + j);
    }
}
