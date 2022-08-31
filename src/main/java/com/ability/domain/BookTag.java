package com.ability.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "book_tag")
@Entity
public class BookTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;

    protected BookTag() {
    }

    public BookTag(final Long id, final Book book, final Tag tag) {
        this.id = id;
        this.book = book;
        this.tag = tag;
    }

    public Tag getTag() {
        return tag;
    }
}
