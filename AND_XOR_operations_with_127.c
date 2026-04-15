#include<stdio.h>
#include<string.h>
void main() {
	char str[] = "Hello World";
	int length, i;
	char ch;
	length = strlen(str);
	printf("Original String is: %s\n\n", str);
	printf("Encrypted String with AND:\n");
	for(i = 0; i < length; i++) {
		ch = str[i] & 127;
		printf("%c", ch);
	}
	printf("\nEncrypted String with XOR:\n");
	for(i = 0; i < length; i++) {
		ch = str[i] ^ 127;
		printf("%c", ch);
	}
}
