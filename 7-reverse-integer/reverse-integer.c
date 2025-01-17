#include <limits.h>

int reverse(int x) {
    if (x == INT_MIN) {
        return 0;
    }
    bool isNeg = false;
    if (x < 0) {
        x = -x;
        isNeg = true;
    }
    int temp = x;
    int rev = 0;

    while (temp > 0) {
        int digit = temp % 10;

        if (rev > (INT_MAX - digit) / 10) {
            return 0; 
        }

        rev = rev * 10 + digit;
        temp = temp / 10;
    }

    if (isNeg) {
        return -rev;
    } else {
        return rev;
    }
}