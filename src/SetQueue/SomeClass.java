package SetQueue;

import java.util.Random;

public class SomeClass implements Comparable<SomeClass>{

    private String someString;
    private Integer someInteger;

    public SomeClass(Random random) {
        char[] chars = new char[5];
        for (int i = 0; i < 5; i++) {
            chars[i] = (char)(random.nextInt(25) + 65);
        }
        this.someString = String.valueOf(chars);
        this.someInteger = random.nextInt(100);
    }

    public String getSomeString() {
        return someString;
    }

    public Integer getSomeInteger() {
        return someInteger;
    }

    @Override
    public int compareTo(SomeClass o) {
        if (this.getSomeString().equals(o.getSomeString())){
            return this.getSomeInteger().compareTo(o.getSomeInteger());
        }
        return this.getSomeString().compareTo(o.getSomeString());
    }

    @Override
    public String toString() {
        return "{" + someString +", " + someInteger + "}\n";
    }
}
