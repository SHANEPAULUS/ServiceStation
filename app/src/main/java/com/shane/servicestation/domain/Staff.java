/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shane.servicestation.domain;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 *
 * @author SHANE
 */
public class Staff implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private int age;
    private ContactDetails address;
    private List<Job> jobList;

    public Staff() {
    }

    public Staff(Builder builder) {
        this.id=builder.id;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.age=builder.age;
        this.jobList=builder.jobList;
        this.address=builder.address;
        this.password=builder.password;
        this.eMail=builder.eMail;
    }
    
    public static class Builder{
        private Long id;
        private String firstName;
        private String lastName;
        private String eMail;
        private String password;
        private int age;
        private List<Job> jobList;
        private ContactDetails address;
       
        public Builder(String lastName)
        {
           this.lastName=lastName;
        }

        public Builder jobs(List<Job> list)
        {
            this.jobList=list;
            return this;
        }

        public Builder address(ContactDetails address)
        {
            this.address=address;
            return this;
        }

        public Builder eMail(String email)
        {
            this.eMail=email;
            return  this;
        }

        public Builder password(String password) throws Exception
        {
            this.password=password;
            return this;
        }


        public Builder id(long value)
        {
            this.id=value;
            return this;
        }

        
        public Builder firstName(String value)
        {
            this.firstName=value;
            return this;
        }
        
        public Builder age(int value)
        {
            this.age=value;
            return this;
        }
        
        public Builder copy(Staff value)
        {
            this.eMail=value.geteMail();
            this.password=value.getPassword();
            this.lastName=value.getLastName();
            this.firstName=value.getFirstName();
            this.id=value.getId();
            this.age=value.getAge();
            this.jobList=value.getJobList();
            this.address=value.getAddress();
            return this;
        }
        
        public Staff build()
        {
            return new Staff(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<Job> getJobList() {
        return jobList;
    }

    public ContactDetails getAddress() {
        return address;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        return !(id != null ? !id.equals(staff.id) : staff.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", jobList=" + jobList +
                '}';
    }
}
