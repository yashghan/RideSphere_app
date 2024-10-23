package com.example.transport.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "admins")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Admin extends User {

}
