package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() + " ";
        Stack s = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                while (!s.empty()) {
                    System.out.print(s.pop());
                }
                System.out.print(" ");
            } else
                s.push(str.charAt(i));
        }
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
/*
//import java.math.BigInteger;
import java.util.*;
import java.util.Stack;
import java.util.Queue;
//import java.util.stream.Stream;
public class Main {
    /* Basic structure of a node of a stack. 'move' will keep track of the direction in which you can move next./
    class Node {
        int x, y;
        int move;

        Node(int i, int j)
        {
            x = i;
            y = j;
            move = 0;
        }
    }
    public static boolean isSafe(int i, int j, int matrix[][]) {
        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length)
            return true;
        return false;
    }
   public boolean findPath(int n, int m, int[][] pixel, boolean[][] visited, int px, int py)
    {//Write your code here
        if(m==0||n==0){
            System.out.println("Invalid input");
        System.exit(0);}
        int i=0,j=0;
        Stack<Node> s = new Stack<>();
        Node temp = new Node(i, j);
        s.push(temp);
        while(!s.isEmpty()){
            int d = s.peek().move;
            i = s.peek().x;
            j = s.peek().y;
            s.peek().move++;
            if(i==px && j==py)
                return true;
            if(d==0){
                if(isSafe(i,j,pixel) && pixel[i][j]!=0 && !visited[i][j]){
                    visited[i][j] = true;
                    i = s.peek().move;}
            }
            else if(d==1){
                if(pixel[i][j]!=0 && !visited[i][j])
                    j = s.peek().move;
            }
            else if(d==2){
                if(pixel[i][j]!=0 && !visited[i][j])
                    i = s.peek().move-1;
            }
            else if(d==3){
                if(pixel[i][j]!=0 && !visited[i][j])
                    j = s.peek().move-j;
            }
            else{
                visited[s.peek().x][s.peek().y] = true;
                s.pop();
            }

        }

        return false;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        boolean[][] visited = new boolean[n][m];

        int[][] pixel = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = false;
                pixel[i][j] = in.nextInt();
            }
        }

        //int px = in.nextInt();
        //int py = in.nextInt();
       /* if (obj.findPath(n, m, pixel, visited, px, py)) {
            System.out.println("path found");
        }
        else {
            System.out.println("path not found");
        }//
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/
  /*  static Boolean isOperand(char c)
{  if (c >= 48 && c <= 57)
    return true;
else
    return false;
}
    public static int computeResult(String input){
        Stack<Integer> Stack = new Stack<>();
        for (int j = input.length() - 1; j >= 0; j--) {
            if (input.charAt(j) == ' ') {
            continue;
            }

            if (isOperand(input.charAt(j)))
                Stack.push((int)(input.charAt(j) - 48));
            else {
                int o1 = Stack.peek();
                Stack.pop();
                int o2 = Stack.peek();
                Stack.pop();
                switch (input.charAt(j)) {
                    case '+':
                        Stack.push(o1 + o2);
                        break;
                    case '-':
                        Stack.push(o1 - o2);
                        break;
                    case '*':
                        Stack.push(o1 * o2);
                        break;
                    case '/':
                        Stack.push(o1 / o2);
                        break;
                    case '^':
                        Stack.push((int)Math.pow(o1,o2));
                        break;
                }
            }
        }

        return Stack.peek();
    }
    public static void main(String[] args) {
        Main obj=new Main();
        Scanner in=new Scanner(System.in);
        String inputString=in.nextLine();
        int result=obj.computeResult(inputString);
        System.out.println(result);
    }
}

   */
    /*
    static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();

        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
                stack.push(c - '0');

                //  If the scanned character is an operator, pop two
                // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String arg[]) {
        Stack<Integer> s = new Stack<Integer>();
        Scanner in = new Scanner(System.in);

        String exp = in.nextLine();
        //Write your code here
        System.out.println(evaluatePostfix(exp));

    }
}*/
   /* static void difference(int height[], int S[]) {
        //Write your code here
        Stack<Integer> s = new Stack<>();
        s.push(0);
        S[0] = 1;
        for(int i=0;i<12;i++){
            while(!s.isEmpty()&& s.peek()<=height[i]){
                s.pop();
            }
            if(s.isEmpty())
                S[i] = i+1;
            else if(height[i]==height[i-1]){
                S[i] = S[i-1]+1;
            }
            else
                S[i] = i-s.peek();
            s.push(i);

        }
        for(int i=0;i<12;i++){
            System.out.print(S[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] height = new int[12];
        for (int i = 0; i < 12; i++) {
            height[i] = in.nextInt();
        }

        // Output array that will store the number of months having rainfall less than the current month
        int S[] = new int[12];
        difference(height, S);
    }
}*/
 /*    //Basic structure of a node of a doubly linked list. This doubly linked list will be used to create a stack.
    class Node {
        Node prev;
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }

    // This is the basic structure of a stack that will reference to two nodes which are 'head' and the 'mid'

    class StackNode {
        Node head;
        Node mid;
        int count;
    }

    // The method will create an object of class StackNode and create a new stack

    StackNode implementStackUsingLinkedlist() {
        StackNode stack = new StackNode();
        stack.count = 0;
        return stack;
    }

    void push(StackNode node, int new_data)
    {
        //Write your code here
        Node temp = new Node(new_data);
        temp.prev = null;
        temp.next = node.head;
        node.count += 1;

        if(node.count==1)
            node.mid = temp;
        else{
            node.head.prev = temp;
            if(node.count%2==1)
                node.mid = node.mid.prev;
        }
        node.head = temp;
    }

    int pop(StackNode stack) {
        //write your code here
        if(stack.count==0)
        {
            System.out.println("The stack is empty");
            System.exit(0);
        }
        Node head = stack.head;
        int item = head.data;
        stack.head = head.next;

        if(stack.head!=null){
            stack.head.prev = null;
            stack.count -= 1;
        }
        if (stack.count%2==0)
            stack.mid = stack.mid.next;
        return item;
    }

    int middleElement(StackNode stack) {
        //write your code here
        if(stack.count==0)
            return 0;
        else
            return stack.mid.data;
    }


    public static void main(String args[]) {
        Main obj = new Main();
        StackNode stack = obj.implementStackUsingLinkedlist();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0)
            System.out.println("The stack is empty");
        else {
            for (int i = 0; i < n; i++) {
                obj.push(stack, in.nextInt());

            }

            System.out.println(obj.pop(stack) + "");
            System.out.println(obj.middleElement(stack) + "");
        }
    }
}

  */
/*
    static String generatePrintBinary(int n) {
        //Write your code here
        String s = new String();
        if(n==0)
            return "";
        else
            s += generatePrintBinary(n/2)+n%2;
        return s;
    }

    public String binaryAddition(String s1, String s2) {
        //Write your code here
        String result="";
        int n=0,m=0;
        for(int i= s1.length()-1;i>=0;i--){
            if(s1.charAt(i)=='1')
            n += Math.pow(2,s1.length()-1-i);
        }
        for(int i= s2.length()-1;i>=0;i--){
            if(s2.charAt(i)=='1')
                m += Math.pow(2,s2.length()-1-i);
        }
        result = generatePrintBinary((n+m));
        return result;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String first = "";
        String second = " ";
        String result = " ";
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        first = obj.generatePrintBinary(n);
        int m = in.nextInt();
        second = obj.generatePrintBinary(m);
        System.out.println(first);
        System.out.println(second);
        result = obj.binaryAddition(first, second);
        System.out.println(result);
        //System.out.println(Integer.valueOf("1"));
    }
}
*/


/*
class Main{
    // Infix to postfix Upgrad code
    public static int getprec(char element) {
        if (element == '+' || element == '-') {
            return 1;
        } else if (element == '*' || element == '/') {
            return 2;
        } else if (element == '^') {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);

        String exp = in.nextLine(), answer = "";

        for (char ch : exp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                answer += ch;

            } else if (ch == '(') {
                s.push('(');
            } else if (ch == ')') {
                while (s.peek() != '(' && !s.empty()) {
                    answer += s.pop();
                }
                if (s.empty()) {
                    System.out.println("Invalid Expression");
                } else {
                    //pop '('
                    s.pop();
                }
            } else {
                while (!s.empty() && getprec(ch) <= getprec(s.peek())) {
                    answer += s.pop();
                }
                s.push(ch);
            }

        }
        while (!s.empty()) {
            answer += s.pop();
        }
        System.out.println(answer);

    }
}
*/
/*/public class Main {
    // Infix to Postfix didn't work for complex case
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);

        String exp = in.nextLine();
        //exp += ')';
        //Write your code here
        String result = "";
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)>='a' && exp.charAt(i)<='z'||exp.charAt(i)>='A' && exp.charAt(i)<='Z')
                result += exp.charAt(i);
            else if(exp.charAt(i)=='('|| exp.charAt(i)=='^' || exp.charAt(i)=='*' || exp.charAt(i)=='/'||exp.charAt(i)=='+'||exp.charAt(i)=='-')
            {
                if((exp.charAt(i)=='+'|| exp.charAt(i)=='-')&&(!s.isEmpty())&&(s.peek()=='^'||s.peek()=='*'||s.peek()=='/'))
                {result += s.pop();
                    s.push(exp.charAt(i));}

                else if((exp.charAt(i)=='*'|| exp.charAt(i)=='/')&& (!s.isEmpty())&& (s.peek()=='^'||s.peek()=='/'||s.peek()=='*'))
                {result += s.pop();
                    s.push(exp.charAt(i));}
                else
                    s.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')')
            {while(!s.isEmpty() && s.peek()!='('){
                result += s.pop();
            }
                if(s.peek()=='(')
                    s.pop();
            }
        }
        while(!s.isEmpty()){
            //if(s.peek()=='(')
            //   s.pop();
            result += s.pop();

        }
        System.out.println(result);
    }
}
 /*   // Delete mid element of stack
    static Stack<Integer> stack = new Stack<>();
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0)
            System.out.println("Stack empty");
        else{
        while (n-- > 0)
            stack.push(s.nextInt());
        n = stack.size();
        deleteMid(stack,n);
        System.out.println(stack);
        }
    }
    static void deleteMid(Stack<Integer> stack, int n) {
        // Write your code here
        if(stack.size()==(n+1)/2)
        {
            stack.pop();
            return;
        }
        else
        {
            int temp = stack.pop();
            deleteMid(stack,n);
            stack.push(temp);
        }

    }
}*/
    /*public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here
        Stack <Integer> temp = new Stack<>();
        int n = stack.size(),i=0;
        n = n-Math.floorDiv(n,2);
        while(i++<n){
            temp.push(stack.pop());
        }
        System.out.println(temp);
        System.out.println(stack);
        while(!stack.isEmpty()){
            stack.pop();
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        System.out.println(temp);
        System.out.println(stack);
    }
}*/
    /*public static Stack < Integer > sortStack(Stack < Integer > input) {
        //write your code here
        Stack <Integer> temp = new Stack <Integer>();
        while(!input.isEmpty()){
            int value = input.pop();
            while(!temp.isEmpty() && value<temp.peek()){
                input.push(temp.pop());
            }
            temp.push(value);
        }
        return temp;
    }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        //write your code here
        int count=0,value=0;
        while(count++<k){
            value = sortedStack.pop();
        }
        System.out.println(value);
    }


    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}*/

    /*public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        // Write your code here
        Stack<Integer> temp = new Stack<Integer>();

        while( !stack.isEmpty() )
        {

            int s1 = (int) stack.pop();

            while( !temp.isEmpty() && (temp.peek() > s1) )
            {
                stack.push( temp.pop() );
            }
            temp.push( s1 );

        }

        // Print the entire sorted stack from temp stack
        System.out.println(temp);
    }
}*/
/*
Reverse the elements
Description
You are given a stack with n integers. You need to reverse the last half of the elements i.e. floor(n/2) elements from the bottom of the stack using recursion and print the elements of the stack.
Note : Floor function takes input as a real number and it returns the greatest integer less than or equal to the input.
Ex. floor(5.4) will give output as 5 and floor(4) will give 4.

Example:
Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Output: [1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]

Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
Output: [1, 2, 3, 4, 5, 6, 11, 10, 9, 8, 7]

Input Format:
12
1 2 3 4 5 6 7 8 9 10 11 12

Output format:
[1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]

public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
        int i=0,l=0,m=0;
        int [] arr;
        l= m = (int)(stack.size()/2);
        arr = new int[l];
        while(l-->0){
            arr[i]=stack.pop();
            i++;
        }
        for(int j=0;j<m;j++){
            stack.push(arr[j]);
        }
        System.out.println(stack);

 */
/*
Stacks
Description
Given a sequence S1, check if it exists in another sequence S2. Assume that all the elements are distinct in both the sequences. Sequence S1 exists in sequence S2 if all the elements of S1 appear in S2 and their relative ordering is the same, which means that there may be elements in the middle of two elements in S2, which are adjacent in S1.

Example:
For input:
S1 = 1 2 3
S2 = 1 4 2 5 6 3
Return: True because S2 also contains 1, 2, 3

For input:
S1 = 1 2 3
S2 = 1 2 4
Return: False because 3 is not present in S2


public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
        int p1,p2,l1,l2,e,flag=0;
        while(!sequence1.empty()){
            e = sequence1.peek();

            if(sequence2.search(e)==-1){
                return false;
            }
            else{
                l1 = sequence1.size();
                l2 = sequence2.size();
                p1 = l1-sequence1.search(e)+1;
                p2 = l2-sequence2.search(e)+1;
                if(l1<=l2)
                { sequence1.pop();
                sequence2.pop();
                    flag=1;}
                else
                {flag=0;
                break;}
            }
        }
        if (flag==1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
 */
/*
class Book {
    public String title;
    public int pagesLeft;

    public Book(String title, int pages) {
        this.title = title;
        this.pagesLeft = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pagesLeft;
    }

    public void read100Pages() {
        System.out.println("Reading 100 pages of " + this.title);
        this.pagesLeft = this.pagesLeft - 100;
    }

    public Boolean completed() {
        return this.pagesLeft <= 0;
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book("Harry Potter", 200);
        Book book2 = new Book("Champak", 100);
        Book book3 = new Book("Lord of the Rings", 300);
        Book book4 = new Book("Tinkle", 100);


        Stack<Book> bookStack = new Stack<Book>();
        // Add code to push the books on the Stack here (in order:
        // book1,book2,book3,book4)
        bookStack.push(book1);
        bookStack.push(book2);
        bookStack.push(book3);
        bookStack.push(book4);
        // Add code to pick the book at the top and read 100 pages
        // Remove the book from the stack if it is completed
        while(!bookStack.empty()){
                if(!bookStack.peek().completed()){
                    bookStack.peek().read100Pages();
                }
                else
                    bookStack.pop();
        }

    }
    }*/

    /*
    //You are given a stack with n integers and you need to print the fifth element from the bottom of the stack.
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        int n = sc.nextInt();
        while (n-- > 0)
            s.push(sc.nextInt());

        printFifthElementFromStart(s);

        }
    static void printFifthElementFromStart(Stack<Integer> stack) {
        int ele=0;
        int count=0;
        int l = stack.size();
        //Stack<Integer> reverse = new Stack<>();
        //while(!stack.empty()){
        //    reverse.push(stack.pop());
        //}
        //while(!reverse.empty() && count<=5){
        //    ele = reverse.pop();
        //    ++count;
        //    if (count==5)
        //        break;
        //    }

        while(!stack.empty()){
            ele = stack.pop();
            ++count;
            if (count==l-4)
                break;
        }
        if(count==l-4){
            System.out.println(ele);}
        else {
            System.out.println("There are not enough elements in the stack");
        }
        }
     */

/*
    //You are given a stack with n integers and you need to print the fifth element from the top of the stack.
    Scanner sc = new Scanner(System.in);
    Stack<Integer> s = new Stack<Integer>();
    int n = sc.nextInt();
        while (n-- > 0)
                s.push(sc.nextInt());

                printFifthElementFromEnd(s);

                }
static void printFifthElementFromEnd(Stack<Integer> stack) {
        int ele=0;
        int count=0;
        while(!stack.empty() && count<=5){
        ele = stack.pop();
        ++count;
        if (count==5)
        break;
        }

        if(count==5){
        System.out.println(ele);}
        else {
        System.out.println("There are not enough elements in the stack");
        }


 */

/*
To reverse words in string instead of reversing whole string
Ex: hard work -> drah krow

Scanner sc = new Scanner(System.in);
        String str = sc.nextLine()+" ";
        Stack s = new Stack<Character>();

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' '){
                while(!s.empty()){
                    System.out.print(s.pop());
                }
                System.out.print(" ");
            }
            else
                s.push(str.charAt(i));
 */


/* To reverse a string using stacks

String str = sc.nextLine();
        Stack s = new Stack();

        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        System.out.println(s);
        while(!s.empty()){
            System.out.print(s.pop());}
 */

/*  To find last non-zero number of a factorial

Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack s = new Stack();
        Stack r = new Stack();

        s.push(BigInteger.valueOf(1));
        for(int i=2;i<=n;i++)
             s.push(BigInteger.valueOf(i).multiply(BigInteger.valueOf(s.pop())));

       /* System.out.println(fact);
        while (fact != 0) {
            s.push(fact % 10);
            fact /= 10;

        }
        while(!s.empty()){
            r.push(s.pop());
        }

        while (!r.empty()) {

            int k = (int) r.peek();
            if (k != 0) {
                System.out.println(k);
                break;
            }
            else{
                r.pop();
            }
        }'


        System.out.println(s.pop());
        */
/*
Stack Implementation using Oops

class Stack{
    private int size; // here size is instance variable
    private int[] array;
    private int top;
    private final int DEFAULT_SIZE = 10;

    public Stack(int size){  // here size is local variable
        this.size = size;    // here value is assigned from local to instance variable using this keyword
        array = new int[size];
        top = -1;
    }
    public Stack(){
        this.size = DEFAULT_SIZE ;
        array = new int[size];
        top = -1;
    }

    public boolean push(int element){
        if(top==size-1) {
            System.out.println("Stack is full");
            return false;
        }
        else{
            array[++top] = element;
            System.out.println(element+" got inserted");
            return true;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -999;
        }
        else{
            return array[top--];
        }

    }
    public boolean is_empty(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return true;
        }
        else{
            System.out.println("Stack isn't Empty");
            return false;
        }

    }
    public int peek(){
        if(top==-1){
            return -1;
        }
        else{
            return array[top];
        }

    }
    public int Size(){
        return size;
    }
    public void printStack(){
        if (top==-1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(array[i]+"->");
            }
        }

    }

}
public class Main{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Stack ");
    int n = sc.nextInt();
    Stack s = new Stack(n); // using user input
    // Stack s1 = new Stack(); // using Default

    // ArrayList s = new ArrayList();
    int check = 1;
    do {
        System.out.println("Enter your choice:");
        System.out.println("Choice 1 : Push elements in stack");
        System.out.println("Choice 2 : Pop elements from stack");
        System.out.println("Choice 3 : Check if stack is empty or not?");
        System.out.println("Choice 4 : Peek top element in stack");
        System.out.println("Choice 5 : Print elements in stack");
        System.out.println("Choice 6 : Print size of stack");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter elements in stack");
                for (int i = 0; i < n; i++) {
                    int ele = sc.nextInt();
                    s.push(ele);
                }
                break;
            case 2:
                System.out.println("remove elements from stack, Enter number of elements to be removed");
                int r = sc.nextInt();
                for (int i = 0; i < r; i++) {
                    s.pop();
                }
                break;

            case 3:
                s.is_empty();
                break;
            case 4:
                System.out.println("Topmost element: " + s.peek());
                break;
            case 5:
                s.printStack();
                break;
            case 6:
                System.out.println("size of stack " + s.Size());
                break;
            default:
                System.out.println("Wrong choice enter again");
                break;
        }
        System.out.println("Want to continue further press 1.Yes else 2.No :");
        check = sc.nextInt();

    }while(check==1);

    // s.push(5);
    //s.push(4);
    //s.push(9);

}
}
 */
/* Stack Implementation

public class StackExample {

static class stack {
int top;
int items[] = new int[100];

void push(int x)
{
if (top == 99)
{
System.out.println("Stack full");
}
else
{
items[++top] = x;
}
}

int pop()
{
if (top == -1)
{
System.out.println("Underflow error");
return -1;
}
else {
int element = items[top];//items[3]
top--;
return element;
}
}

boolean isEmpty()
{
return (top == -1) ? true : false;
}
}
public static void main(String[] args) {
stack s = new stack();
s.push(1);
System.out.println(s.pop());
}
}

Stack <Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
System.out.println(stack.pop());
System.out.println(stack.pop());
*/


/*
To print this pattern:
*
**
***
****
*****
******
*****
****
***
**
*

public class Main {

    public static void main(String[] args) {
	// write your code here
      int n=6;
      for(int i=1;i<=n;i++){
          for(int j=0;j<i;j++)
          {System.out.print("*");}
          System.out.println();}
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++)
            {System.out.print("*");
            n--;}
            System.out.println();}
    }
}


 */


