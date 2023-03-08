package domain;

public class Student {
    private String name;
    private String uID;
    private int age;
    private double height;
    private double score;

    public Student(String UID, int age, double height, double score) {
        this.uID = UID;
        this.age = age;
        this.height = height;
        this.score = score;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("uID: ").append(uID);
        sb.append(", age:").append(age);
        sb.append(", height:").append(height);
        sb.append(", score: ").append(score);
        return sb.toString();
    }
    
    
}
