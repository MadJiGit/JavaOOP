package reflectionAndAnnotation;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Class<Test> reflectionClass = Test.class;

        Field[] fields = reflectionClass.getFields();

        for (Field f : fields){
            System.out.println("name is " + f.getName());
        }
    }
}
