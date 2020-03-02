package tuan.me.linksaver.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tbl_link")
@Data
@Entity
public class Link implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    
}