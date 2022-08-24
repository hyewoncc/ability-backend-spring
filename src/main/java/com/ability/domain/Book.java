package com.ability.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Table(name = "book")
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "text", length = 10000)
    private String text;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    protected Book() {
    }

    public Book(final Long id,
                final String name,
                final String text,
                final LocalDateTime createdAt,
                final LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
