import java.text.Format;
import java.util.Arrays;

class Person {
    String firstName;   // first_name
    String lastName;    // last_name
}

class Parent {

}

class Child extends Parent {

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println();
        // bin(2진 표현)
            // 00 = 0
            // 01 = 1
            // 10 = 2
            // 11 = 3
        
        // 기본 자료형(Primitive Data Type)
            // 정수형 데이터 타입: byte(8bit = 1byte), short(16bit = 2byte), int(32bit = 4byte), long(64bit = 8byte)
            // 실수형 데이터 타입: float(32bit = 4byte), double(64bit = 8byte)
            // 문자형 데이터 타입: char(character) : 16bit 크기의 유니코드 뮨자를 저장할 수 있다.
            //                    String : 16bit 크기의 유니코드 문자'열'을 저장할 수 있다.
            // 논리형 데이터 타입: boolean: true / false    1/0

        // 참조 자료형(Reference Data Type)
            // class : 객체의 참조(메모리 주소)를 저장한다. (클래스, 인터페이스, 배열, 사용자 정의 클래스, 자바에서 제공하는 라이브러리)
            // 인터페이스 : 사용자가 정의한 자료형
        
        int age = 17;
        double height = 160.5;
        char initial = 'J';
        String name = "Jung Eun Kyo";
        boolean isAlive = false;

        // System.out.println(age);
        // System.out.println(height);
        // System.out.println(initial);
        // System.out.println(name);
        // System.out.println(isAlive);

        System.out.printf("age: %s \nheight: %s \ninitial: %s \nname: %s \nisAlive: %s", age, height, initial, name, isAlive);

        System.out.println();

        Person person = new Person();
        person.firstName = "EunKYo";
        person.lastName = "Jung";
        String fn = person.firstName;
        String ln = person.lastName;

        System.out.println("name : " + fn);
        System.out.println("Full Name : " + fn + " " +ln);

        // 배열

        int[] numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 1;

        String[] names = {"JayLee", "Nomuh", "Kyo"};
        
        // 주소값이 출력
        System.out.println(numbers);
        System.out.println(names);

        // 주소값의 내용이 출력
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

        System.out.println();

        // 자료의 형의 변환
            // 암시적 변환 : 자바가 자동으로 수행하는 형 변환
            // 명시적 변환 : 사용자가 수동으로 수행하는 형 변환

            // 암시적
            int intValue = 83; // 4byte
            double doubleValue = intValue; // 8byte
            System.out.println(doubleValue);

            // 명시적
            double doubleValue1 = 83.3;
            int intValue1 = (int)doubleValue1;
            System.out.println(intValue1);

            // 클래스 형 변환
            Parent parent = new Child();
            Child child = (Child)parent;

            // 정수 to 문자
            int num = 29;
            String intString = Integer.toString(num);

            // 실수 to 문자
            double doubleValue2 = 34.17;
            String doubleString = Double.toString(doubleValue2);

            // 정수 to 문자
            String intStringOf = String.valueOf(num);
            String doubleStringOf = String.valueOf(doubleValue2);
            
            // 문자 to 정수
            String intStringInt = "42";
            int intValueSting = Integer.parseInt(intStringInt);

            // 문자 to 실수
            String doubleStringDouble = "42.5";
            double doubleStringdouble = Double.parseDouble(doubleStringDouble);
    }
}
