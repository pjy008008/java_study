package mid2.generic.ex3;

import mid2.generic.animal.Cat;
import mid2.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //개 병원에 고양이 전달
        dogHospital.set(cat); //매개 변수 체크 실패: 컴파일 오류가 나지 않음

        //개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
