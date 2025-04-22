package com.codespace.junit_rest_api;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="book_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    @NonNull
    private String name;

    @NonNull
    private String summary;

    @NonNull
    private int rating;

}
