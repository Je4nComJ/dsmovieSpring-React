package com.devsuperior.dsmovie.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScorePK id = new ScorePK();
    private Double scoreValue;

    public Score(){
    }

    public ScorePK getId() {
        return id;
    }

    public void setMovie(Movie movie){
        id.setMovie(movie);
    }

    public void setUser(User user){
        id.setUser(user);
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

    public Double getValue() {
        return scoreValue;
    }

    public void setValue(Double scoreValue) {
        this.scoreValue = scoreValue;
    }
}
