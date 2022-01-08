#include <iostream>

int main() {
    // Pattern Problems
     * Print the below Pattern*
1 2 3
1 2 3
1 2 3
    int n,i = 1;
    std::cout << "Enter the Number \n";
    std::cin >> n;

    while(i<=n){

      int j=1;
      while(j<=n){
        std::cout << j << " ";
        j++;
      }
      std::cout << "\n";
      i++;
    }


  * Print the below Pattern*
3 2 1
3 2 1
3 2 1
    int n,i = 1;
    std::cout << "Enter the Number \n";
    std::cin >> n;

    while(i<=n){

      int j=1;
      while(j<=n){
        std::cout << n-j+1 << " ";
        j++;
      }
      std::cout << "\n";
      i++;
    }


  `` Print the below Pattern ``
1 2 3
4 5 6
7 8 9
int n,i=1,count = 1;
std::cout << "Enter the Number \n";
std::cin >> n;
while(i<=n){

  int j = 1;
  while(j<=n){
    std::cout << count << " ";
    j++;
    count++;
  }
  std::cout << "\n";
  i++;
}

  `` Print the below Pattern ``
*
* *
* * *
* * * *
  int n,i =1;
  std::cout << "Enter the Number \n";
  std::cin >> n;
  while(i<=n){
   int j = 1;
    while(j<=i){
      std::cout << "*" << " ";
      j++;
    }
    std::cout << "\n";
    i++;
  }


    ``Print the Below pattern``
1
2 2
3 3 3
4 4 4 4
  int n,i =1;
  std:: cout << "Enter the Number \n";
  std:: cin >> n;

  while(i<=n){
    int j=1;
    while(j<=i){
      std::cout << i << " ";
      j++;
    }
    std::cout<<"\n";
    i++;
  }


    ``Print the Below pattern``
1
2 3
4 5 6
7 8 9 10
  int n,i = 1,count = 1;
  std:: cout << "Enter the Number \n";
  std:: cin >> n;

  while(i<=n){
    int j=1;
    while(j<=i){
      std::cout << count << " ";
      j++;
      count++;
    }
    std::cout<<"\n";
    i++;
  }

}