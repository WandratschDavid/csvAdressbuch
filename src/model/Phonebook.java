package model;

import java.util.ArrayList;
import java.util.List;

public class Phonebook
{
    private List<Person> Persons = new ArrayList<Person>();


    public void loadCSV()
    {
        //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
    }

    public void saveCSV()
    {
        //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
    }

    public void getPerson()
    {
        //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
    }

    public void addPerson(String name, String address, String phoneNum)
    {
        Person person = new Person();

        person.setName(name);
        person.setAddress(address);
        person.setPhoneNum(phoneNum);

        Persons.add(person);
    }

    //#############################################################    IMPLEMENTATION NEEDED    ##########################################################################
}