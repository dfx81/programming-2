# Question 1

- String str1 = new String("This is one way");
- String str2 = "This is another way";

# Question 2

- ",blu"

# Question 3

- for generating a rand number in a range, the below
  formula is used:

    min + rand((max - min) + 1)
    
- therefore, the statement returns a rand number
  between 10 - 50

# Question 4

  final int bound = 100;
  Random rand = new Random();
  int num1 = rand.nextInt(bound);
  int num2 = rand.nextInt(bound);
  
  System.out.println(Math.max(num1, num2));

# Question 5

- "abcabc"
- Either 3 or 4

# Question 6

a) Scanner in = new Scanner(System.in);
b) int x = in.nextInt(); int y = in.nextInt();
c) System.out.println(Math.pow(x, y));

# Question 7

a) System.out.println(text1.length() + text2.length() + text3.length());
b) System.out.println(text2.substring(0, text2.indexOf("S")) + text1.substring(text1.indexOf("C"), text1.length()));