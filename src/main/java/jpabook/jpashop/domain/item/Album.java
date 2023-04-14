package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@DiscriminatorColumn(name = "A")
public class Album extends Item{
    private String artist;
    private String etc;
}
