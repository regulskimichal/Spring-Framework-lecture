package pl.michalregulski.springdemo;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Todo {
    Long id;
    String message;
    Boolean done;
}
