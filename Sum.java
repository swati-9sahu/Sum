public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 200; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}```java
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 200; i += 2) {
            sum += i;
        }
        System.out.println("Sum of first 100 even numbers: " + sum);
    }
}
```

Commands to create a git project:

```bash
mkdir SumProject
cd SumProject
git init
touch Sum.java
```

Copy the above Java code into `Sum.java` file.

```bash
git add Sum.java
git commit -m "Initial commit"
```