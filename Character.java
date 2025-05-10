abstract class Character
{
    private String name;
    private int age;
    private String gender;
    
    public Character(name, age, gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

}
