package homework4;

import java.security.SecureRandom;

public class Employee {
    private static final SecureRandom random = new SecureRandom();
    private Long personNumber;
    private String phoneNumber;
    private String fullName;
    private int experience;

    public Employee(String phoneNumber, String fullName, int experience) {
        this.personNumber = random.nextLong();
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.experience = experience;
    }

    public Long getPersonNumber() {
        return personNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personNumber=" + personNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", experience=" + experience +
                '}';
    }
}
