import java.util.Scanner;

public class Patient {
    private String name;                //Поля
    private String surname;
    private String patronymic;
    private int age;
    public boolean gender;
    private String genderString;






    Patient(String name,String surname,String patronymic,int age,boolean gender){
        this.name=name;
        this.surname=surname;                   //Подготавливаем конструктор
        this.patronymic=patronymic;
        this.age=age;
        this.gender=gender;
        this.info();
    }

    public String getName() { return name; }           //Геттеры
    public String getSurname() { return surname; }
    public String getPatronymic() { return patronymic; }
    public int getAge() { return age; }
    public boolean getGender() { return gender; }
    public String getGenderString(){return genderString;}

    public void setName(String name) { this.name = name; }               //Сеттеры
    public void setSurname(String surname) { this.surname = surname; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }
    public void setAge(int age) { this.age = age; }
    public void setGender(boolean diagnosis) { this.gender = diagnosis; }
    public void setGenderString(String diagnosisString){this.genderString=diagnosisString;}

    public void info(){
        System.out.println("Ф.И.О.: "+getSurname()+" "+getName()+" "+getPatronymic()+" "+"Возраст: "+getAge()+" "+"Болен или нет: "+ getGenderString());


    }

}
