// A string containing only parentheses is balanced if the following is true: 

// 1. If it is an empty string 

// 2. If A and B are balanced, AB is balanced,where A and B are strings of parenthesis 

// 3. If A is balanced, (A) and {A} and [A] are also balanced, where A is string of parenthesis 

// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 
// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
// Given a string, determine if it is balanced or not. Output "true" or "false"

import java.util.Scanner;

public class Balanced_Parentheses {
    static int top = -1;
    static char stack[] = new char[100];

    public static void push(char x) {
        if (top == stack.length - 1)
            System.out.println("OVERFLOW");
        else {
            top++;
            stack[top] = x;
        }
    }

    public static void pop() {
        if (top == -1)
            System.out.println("UNDERFLOW");
        else {
            top--;
        }
    }

    public static void display() {
        if (top == -1)
            System.out.println("STACK EMPTY");
        else {
            for (int i = top; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean balanced = true;
        if(input.isEmpty())
            balanced = true;
        else {
        for(int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            
            if(ch == '(' || ch == '{' || ch=='[')
                push(ch);
            else if(top!=-1 && ch == ')'&&stack[top]=='(')
                pop();
            else if(top!=-1 && ch=='}' &&stack[top]=='{')
                pop();
            else if(top!=-1 && ch==']' && stack[top]=='[')
                pop();
            else {
                balanced = false;
                break;
            }
        }
        if(top != -1)
            balanced = false;
        
        System.out.println(balanced);
            
    }
}
