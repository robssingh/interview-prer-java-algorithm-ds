package javaPractice;

import java.util.*;

public final class ImmutableStudent {
    // Create PRIVATE and STATIC members
    private final String name;
    private final int regNo;
    private final Map<String, String> metaData;

    // Parameterized constructor with deep copy for Objects
    public ImmutableStudent(String name, int regNo, Map<String, String> metaData) {
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metaData = tempMap;
    };

    // Getters to access variables but deep copy for Object types(non-immutable
    // objects).primitive types and Wrapper classes for them are not required to
    // return cloned copies. as they are immutable, so changing the state will
    // create new copy and won't change the state of original object.
    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetaData() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : this.metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "value1");
        map.put("2", "value2");
        ImmutableStudent s1 = new ImmutableStudent("Robin", 123, map);
        System.out.println(s1.metaData.size());
        // map.put("3", "value3");
        // s1.name.replace("ob", "on");
        // System.out.println(s1.metaData.size());
        // System.out.println(s1.name);

        // Here its allowed to access directly private variable and change it..
        // But we can't do it in more practical case ie in below Test class.
        // So Immutability is maintained outside the class.
        s1.metaData.put("4", "value4");
        System.out.println(s1.metaData.size()); // Not immutable so far in same class
    }
}

class Test1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "value1");
        map.put("2", "value2");
        ImmutableStudent s1 = new ImmutableStudent("Robin", 123, map);
        // Its immutable outside so size will still remain as 2
        s1.getMetaData().put("3", "value3");
        System.out.println(s1.getMetaData().size());
    }
}
