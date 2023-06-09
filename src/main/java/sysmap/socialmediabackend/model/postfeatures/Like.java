package sysmap.socialmediabackend.model.postfeatures;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sysmap.socialmediabackend.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Like {
    @Id
    private String id;
    @CreatedDate
    private LocalDateTime createdAt;

    @DBRef
    private User user;
}