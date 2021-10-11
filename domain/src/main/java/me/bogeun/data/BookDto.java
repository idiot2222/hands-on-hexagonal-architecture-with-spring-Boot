package me.bogeun.data;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {

    private Long id;

    private String title;

    private String description;

    private Double price;

}
