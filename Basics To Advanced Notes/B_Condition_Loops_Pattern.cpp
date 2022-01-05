#include <iostream>

int main() {

  int n;
  std::cin >> n;

  // std::cout << "The value you have entered is " << n  <<"\n";

  //if a is positive

  if(n>0){
    std::cout << "A is Positive" << "\n";
  }else{
    std::cout << "A is Negative \n";
  }


  int a,b;
  std::cin >> a >> b;
  std::cout << "The value of a is " << a << " and b is " << b << "\n";


  int takingSpaceInInput = std::cin.get();
  std::cout << "value of taking Space char as input is " << takingSpaceInInput << "\n";



  //Program to calculate which number is greater
  int a,b;
  std::cout<<"Enter the value of a \n";
  std::cin >> a;
  std::cout<<"Enter the value of b \n";
  std::cin >> b;

  if(a>b){
    std::cout << "A is greater \n";
  }else{
    std::cout << "B is Greater \n";
  }


  //Program to check is number is 0, +ve or -ve
  int a;
  std::cout<<"Enter the value of a \n";
  std::cin >> a;
  if(a>0){
    std::cout << "Number is +ve \n";
  }
  else if(a<0){
    std::cout << "Number is -ve \n";
  }else{
    std::cout << "Number is 0 \n";
  }


  //  1.HomeWork Questions
  int a = 2, b = a + 1;
  if((a=3) == b){
    std::cout<<a;
  }else{
    std::cout << a+1;
  }
  //O/p -> 3


  //  2.Questions
  int a = 24;
  if(a>20){
    std::cout << "Love";
  }
  else if(a==24){
    std::cout << "Lovely";
  }
  else{
    std::cout << "Babbar";
  }
  std::cout << a;
  //    o/p -> Love24

  //Print if entered char is Lowercase, Uppercase or Number;
  char ch;
  std::cout<<"Enter the character \n";
  std::cin >> ch;
  if(ch >= 'a' && ch<= 'z'){
    std::cout << "This is lowercase \n";
  }
  else if(ch >= 'A' && ch <= 'Z'){
    std::cout << "This is UpperCase \n";
  }
  else if(ch >= 48 && ch <= 57 ){
    std:: cout << "This is Numberic \n";
  }


  //Print Number 1 to N in while loop.
  int n, i = 1 ;
  std::cout << "Enter the Number \n";
  std::cin >> n;

  while(i<= n){
    std::cout << i << " ";
    i++;
  }


  //Print the sum of the number from 1 to N
  int n, sum = 0, i = 1;
  std::cout << "Enter the value of N \n";
  std::cin >> n;

  while(i<= n){
    sum += i;
    i++;
  }
  std::cout << "Sum is " << sum<<"\n";


  // 3. Find Sum of all even number from 0 to N
  int n, sum = 0, i = 0;
  std::cout << "Enter the value of N \n";
  std::cin >> n;

  while(i<= n){
    sum += i;
    i = i+2;
  }
  std::cout << "Sum is " << sum<<"\n";


  // Given Number is Prime Number or not
    int n,i = 2,count = 1;
  std::cout << "Enter the any number \n";
  std::cin >> n;
  while(i<n){
    if( n%i == 0){
      count++;
    }
    i++;
  }
  if(count >= 2 && n != 2 ){
    std::cout << "Number is not prime";
  }else{
    std::cout << "Number is prime";
  }


  //Print pattern
  int n,i = 1;
  std::cout << "Enter the any number \n";
  std::cin >> n;

  while(i<=n){

    int j=1;
     while(j<=n){
       std::cout << "*" << " " ;
       j++;
    }
    std::cout<< "\n";
    i++;
  }
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *


  int n,i = 1;
  std::cout << "Enter the any number \n";
  std::cin >> n;

  while( i<= n){

    int j = 1;
    while(j<=n){
      std::cout<<i<<" ";
      j++;
    }
    std::cout << "\n";
    i++;
  }
1 1 1
2 2 2
3 3 3


}