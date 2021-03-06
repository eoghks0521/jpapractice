package com.bigring.jparoadmap;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue("M")
public class BasicMovie extends BasicItem {

    private String director;
    private String actor;
}
