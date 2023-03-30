package hello.core;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok HelloLombok = new HelloLombok();
        HelloLombok.setName("aaa");
        System.out.println(HelloLombok.getName());
        System.out.println(HelloLombok);
    }


}
