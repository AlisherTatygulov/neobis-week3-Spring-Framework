package com.neobis.springbootdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sub_genres")
public class SubGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_genre_id")
    private int subGenreId;

    @Column(name = "sub_genre_name")
    private String subGenreName;

    @Column(name = "genre_id")
    private int genreId;

}
