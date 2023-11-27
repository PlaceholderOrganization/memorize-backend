package memgrp.memorize.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Value {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "value_id")
    int valueId;

    @Column(name = "value_description", length = 200)
    String valueDescription;

    @Column(name = "value_number")
    int valueNumber;

    @ManyToOne()
    @JoinColumn(name = "matrix_id")
    Matrix matrix;

//    @OneToMany(orphanRemoval = true, mappedBy = "value")
//    List<Card> cards;
//
//    public void addCards(Card card){
//        if(cards == null){
//            cards = new ArrayList<>();
//        }
//        cards.add(card);
//    }


}