package com.itivanov18.vacationmanager.Model;
import javax.persistence.*;


@Entity
@Table
public class Users {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String team;
    @Column
    private String role;
    @Column
    private String nickname;
    @Column
    private String password;
    @Column
    private String firstName;
    @Column
    private String lastName;

    public Users(String nickname, String password, String firstName, String lastName, String role, String team) {
        this.nickname = team;
        this.password = role;
        this.firstName = nickname;
        this.lastName = password;
        this.role = firstName;
        this.team = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public String getTeam()  {
        return team;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTeam(String team) {
        this.team = team;
    }

}
